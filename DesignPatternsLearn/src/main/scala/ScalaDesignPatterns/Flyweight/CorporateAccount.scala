package ScalaDesignPatterns.Flyweight

/**
  * Created by hjw on 17/10/2.
  *
  * The Corporate Account case class mixes in the Account trait
  * and defines three read only properties for the (account) number,
  * the counterparty name and the valid indicator (which is defaulted to true).
  * A println is used to show when a Corporate Account is created.
  *
  */
case class CorporateAccount(val number: String,
                            val counterpart: String,
                            val valid: Boolean = true) extends Account {
  println("Creating Corporate Account: " + number)
}
