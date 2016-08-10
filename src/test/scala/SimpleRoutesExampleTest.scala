import org.scalatest.{ Matchers, WordSpec }
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.server._
import Directives._

class SimpleRoutesExampleTest extends WordSpec with Matchers with ScalatestRouteTest with SimpleRouteExample{

  "The service" should {

    /*"return a greeting for GET requests to the root path" in {
      Get() ~> routes ~> check {
        responseAs[String] should contain("<title>WWEBAPPPPPPPP</title>")
      }
    }*/

    "return a '<h1>get</h1>' response for GET requests to /users" in {
      Get("/users") ~> routes ~> check {
        responseAs[String] shouldEqual "<h1>get</h1>"
      }
    }

    "return a '<h1>getuser2</h1>' response for GET requests to /users/2" in {
      Get("/users/2") ~> routes ~> check {
        responseAs[String] shouldEqual "<h1>getuser2</h1>"
      }
    }

    "return a '<h1>post</h1>' response for POST requests to /users" in {
      Post("/users") ~> routes ~> check {
        responseAs[String] shouldEqual "<h1>post</h1>"
      }
    }

    "leave GET requests to other paths unhandled" in {
      Get("/userswqeqweqweqweqw") ~> routes ~> check {
        handled shouldBe false
      }
    }
  }
}