[<img src="https://cdn.anychart.com/images/logo-transparent-segoe.png?2" width="234px" alt="AnyChart - Robust JavaScript/HTML5 Chart library for any project">](https://anychart.com)
# Scala Play basic template

This example shows how to run Anychart library with the Scala programming language using Play framework 2.5.x and MySQL.

### Running
To use this sample you must have Java, Scala, Activator and Mysql installed,
if you do not have Java, please, visit [Java download page](https://java.com/download/);
if you do not have Scala, please, visit [Scala official site](http://www.scala-lang.org/);
if you do not have Activator, please, visit [Activator download page](https://www.lightbend.com/activator/download);
if you do not have MySQL, please, visit [MySQL download page](https://dev.mysql.com/downloads/installer/) and follow [instructions](http://dev.mysql.com/doc/refman/5.7/en/installing.html)

To check your Java installation, run following command in command line:
```
$ java -version
java version "1.8.0_111"        # sample output
Java(TM) SE Runtime Environment (build 1.8.0_111-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.111-b14, mixed mode)
```
To check your Scala installation, run following command in command line:
```
$ scala -version
Scala code runner version 2.12.0 -- Copyright 2002-2016, LAMP/EPFL and Lightbend, Inc.     # sample output
```
To check your Activator installation, run following command in command line:
```
$ activator
Did not detect an activator project in this directory...  # sample output
```
To check your MySQL installation, run following command in command line:
```
$ mysql --version
mysql  Ver 14.14 Distrib 5.5.52, for debian-linux-gnu (x86_64) using readline 6. # sample output
```

To start this example run commands listed below.

Clone the repository from github.com to your workspace folder:

```
$ git clone git@github.com:anychart-integrations/scala-play-mysql-template.git
```

Navigate to the repository folder:
```
$ cd scala-play-mysql-template
```

Set up MySQL database, use -u -p flags to provide your user name and password:
```
$  mysql < database_backup.sql
```

Run app
```
$ activator run
```

open browser at http://localhost:9000/


## Workspace
Your workspace should look like:
```
scala-play-mysql-template/
    app/
        controllers/
            ChartController.scala           # web controller to display chart
            ... other controllers
        filters/
            ...
        models/
            DBFruits.scala                  # Slick MySQL database access class
        services/
            ... some example services
        views/
            chart.scala.html                # view
            ... other views
        Filters.scala
        Module.scala
    bin/
    conf/
        application.conf                    # main application settings
        routes                              # routes
    libexec/
    logs/
    project/
    public/
        images/
        javascripts/
        stylesheets/
            main.css                        # main css style
    target/
    test/
    .gitignore
    build.sbt
    database_backup.sql                     # use this file to set your MySQL database
    LICENSE
    README.md
```
More about anatomy of Play application you can see [here](https://www.playframework.com/documentation/2.5.x/Anatomy).

## Technologies
Platform - [Java](https://java.com/)<br />
Language - [Scala](http://www.scala-lang.org/)<br />
Database - [MySQL](https://www.mysql.com/)<br />
Web framework - [Play](https://www.playframework.com)<br />
Database mapping - [Slick](http://slick.lightbend.com/)<br />
Build tool - [Activator](https://www.lightbend.com/activator/download)

## Further Learning
* [Documentation](https://docs.anychart.com)
* [JavaScript API Reference](https://api.anychart.com)
* [Code Playground](https://playground.anychart.com)
* [Technical Support](https://anychart.com/support)

## License
[© AnyChart.com - JavaScript charts](http://www.anychart.com). Released under the [Apache 2.0 License](https://github.com/anychart-integrations/scala-play-mysql-template/blob/master/LICENSE).
