import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val AkkaRepo  = "Akka Maven Repository" at "http://akka.io/repository"

  val akka_sbt_plugin = "se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.2"
}
