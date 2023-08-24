package AccountLogn

import java.util.UUID

/*
  Note that the below data model should be aligned with the data tables you want to react to
 */
sealed trait Action
case class Login(email: String, password: String) extends Action
case class createAccount(account: accountId) extends Action
case class deleteAccount(account: accountId) extends Action


case class accountId(fullName: String, email: String, password: String, id: UUID)