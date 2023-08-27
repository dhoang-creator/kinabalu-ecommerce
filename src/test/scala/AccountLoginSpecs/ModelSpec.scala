package AccountLoginSpecs

import AccountLogn.Login
import org.scalatest.funspec.AnyFunSpec

class ModelSpec extends AnyFunSpec {

  describe("input cannot be found") {
    it("if email cannot be found, exception needs to be thrown") {
      // Is the below assertion for an expected result enough?
      assert(Login.checkDBForEmail(email = "123@hotmail.co.uk"))
    }
  }

}
