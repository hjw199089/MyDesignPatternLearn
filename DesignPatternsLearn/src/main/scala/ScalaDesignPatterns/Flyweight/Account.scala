package ScalaDesignPatterns.Flyweight

/**
  * Created by hjw on 17/10/2.

Account trait defines the abstract read only properties number,counterparty and valid.
The Account represents the account for a counter party involved in various trades.
As the account used for any number of trades by a counter party is the same account it can be shared amongst all the trades.
Note that the account is immutable as it represents information about an account (such as the counter parties name,
their account number and whether the account is valid or not).
It is not the actual account and thus does not have a balance or set of transactions associated with it.
  */
//享元
trait Account extends FlyWeight with  Immutable{
  val number:String
  val counterpart:String
  val valid:Boolean

}
