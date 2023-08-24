package AccountLogn

import cats.effect.IO
import org.http4s.ember.server.EmberServerBuilder
import org.http4s.server.Router
import org.typelevel.log4cats.LoggerFactory
import org.typelevel.log4cats.slf4j.Slf4jFactory

object Server {

  /*
    Any alternatives to SLF4J for purely functional Scala with Cats
    We need to learn the foundations of the LoggerFactory below
   */
  implicit val loggerFactory: LoggerFactory[IO] = Slf4jFactory.create[IO]

  val services = ???
  val httpApp = Router("/" -> helloWorldService, "/api" -> services).orNotFound
  val server = EmberServerBuilder
    .default[IO]
    .withHost(ipv4"0.0.0.0")
    .withPort(port"8080")
    .withHttpApp(httpApp)
    .build
}
