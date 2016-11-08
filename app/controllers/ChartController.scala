package controllers

import javax.inject._
import models.DBFruits
import play.api.libs.json._
import play.api.mvc._

import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class ChartController @Inject()(dBFruits: DBFruits) extends Controller {

   def index = Action.async { implicit request => {
      dBFruits.getTopFruits.map {
         data => Ok(views.html.chart("Scala Play template", "Top 5 fruits", Json.stringify(Json.toJson(data))))
      }
   }
   }

}
