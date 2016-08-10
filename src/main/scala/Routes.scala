import akka.http.scaladsl.server.Directives._

trait SimpleRouteExample {

  val routes =
    post {
      path("users") {
        complete("<h1>post</h1>")
      }
    } ~
      get {
        path("users") {
          complete("<h1>get</h1>")
        }~
          path("users" / IntNumber) { int =>
            complete("<h1>getuser" + int + "</h1>")
          }
      }~ path("")(getFromResource("public/index.html"))
}
