package AccountLogn

import java.util.UUID

/*
  Note that the below data model should be aligned with the data tables you want to react to
 */
sealed trait Action
case class Login(email: String, password: String) extends Action
case class createAccount(account: accountId) extends Action
case class deleteAccount(account: accountId) extends Action


case class accountId(id: UUID, name: String, email: String, password: String)

object Login {

  // if we're simply pattern matching that the inputted input is found within the DB, does the below method need all the fluff?
  // We need to break down the UI
  def checkDBForEmail(email: String): Boolean = email match {
    case email =>   ???
    case _     =>   throw new Exception("no such email found in the database")
  }

  // here, we would need to access the
  def accessDB(email: String): Boolean = ???
}