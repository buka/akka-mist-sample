import sbt._

class AkkaTemplate(info: ProjectInfo) extends DefaultProject(info) with AkkaProject {

  val AkkaRepo = "Akka Maven Repository" at "http://akka.io/repository"

  val akka_http = akkaModule("http")

}
