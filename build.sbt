import com.github.play2war.plugin.{Play2WarKeys, Play2WarPlugin}

name := "products"

version := "0,1"

Play2WarPlugin.play2WarSettings

Play2WarKeys.servletVersion := "3.0"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)

play.Project.playScalaSettings


