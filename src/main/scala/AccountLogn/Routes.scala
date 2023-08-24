package AccountLogn

import cats.effect._
import org.http4s.HttpRoutes

object Routes {

  // When we think about the routes that we want our API service to encapsulate, how do we dynamically generate for the different HTTP Verbs
  val loginCredentials = HttpRoutes.of[IO] {
    // we've taken the data model from the models and just plugged it into this GET request, is this correct?
    case GET -> Root / Login / (email,password) =>
      IO(Response(Status.Ok))
  }

  val noSuchLogin = HttpRoutes.of[IO] {
    case _ -> NoContent()
  }.orNotFound.run(getRoot).unsafeRunSync()

  // The below model doesn't quite work in the same way as the above model, why is that?
  val createAccount = HttpRoutes.of[IO] {
    case PUT -> Root / createAccount / account =>
      IO(Response.Status.Ok)
  }
}
