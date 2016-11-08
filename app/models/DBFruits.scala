package models

import javax.inject.Inject
import play.api.db.slick.DatabaseConfigProvider
import play.api.libs.json._
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._
import slick.lifted.{TableQuery, Tag}
import javax.inject.Singleton
import scala.concurrent.Future

case class Fruit (id:Int, name:String, value:Int)

object Fruit {

   implicit object FruitFormat extends Format[Fruit] {
      // convert from Fruit object to JSON (serializing to JSON)
      def writes(fruit: Fruit): JsValue = {
         val fruitSeq = Seq(
            "name" -> JsString(fruit.name),
            "value" -> JsNumber(fruit.value)
         )
         JsObject(fruitSeq)
      }
      // convert from JSON string to a Fruit object (de-serializing from JSON)
      def reads(json: JsValue): JsResult[Fruit] = {
         JsSuccess(Fruit((json \ "id").as[Int], (json \ "name").as[String], (json \ "value").as[Int]))
      }
   }

   def tupled = (this.apply _).tupled
}

@Singleton
class DBFruits @Inject()(protected val dbConfigProvider: DatabaseConfigProvider) {
   val dbConfig = dbConfigProvider.get[JdbcProfile]

   val fruits = TableQuery[Fruits]

   def getTopFruits: Future[Seq[Fruit]] = {
      dbConfig.db.run(fruits.sortBy(_.value.desc).take(5).result)
   }

   class Fruits(tag: Tag) extends Table[Fruit](tag, "fruits") {
      def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
      def name = column[String]("name")
      def value = column[Int]("value")
      override def * = (id, name, value) <> (Fruit.tupled, Fruit.unapply)
   }
}