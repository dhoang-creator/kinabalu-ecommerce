package AccountLogn

import io.circe._
import io.circe.syntax.EncoderOps

/*
  The below is actually taken from 'Hacking with scala circe-json'
 */
case class User(id: String, name: String, email: Option[String], isActive: Boolean)

object User {

  def handleUser(): Unit = {
    val usr = User("9112", "rahasak", None, isActive = false)
    println(usr.asJson())

    val json =
      """
        |{"id":"9112","name":"rahasak","email":null,"isActive"}
        |""".stripMargin
    println(parser.decode[User](json))
  }
}

case class Creator(id: String, name: String, email: String)

case class Promise(id: String, creator: Creator, createTime: Long)

object Creator {

  def handlePromise(): Unit = {
    val usr = Promise("4112", Creator("42323", "rahasak", "ops@rahasak.io"), System.currentTimeMillis() / 1000)
    println(usr.asJson.noSpaces)

    val json =
      """
        |{"id":"4112","creator":{"id":"42323","name":"rahasak","email""ops@rahasak.io"},"createTime":157178807}
        |""".stripMargin
    println(parser.decode[Promise](json))
  }
}

// Stopped at the List Object section