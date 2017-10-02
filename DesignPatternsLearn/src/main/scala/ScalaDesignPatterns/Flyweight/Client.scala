package ScalaDesignPatterns.Flyweight

/**
  * Created by hjw on 17/10/2.
  */
object Client extends App{
  val a1 = AccountFlyweightFactory.get("111")
  println("a1 = " + a1)
  val a2 = AccountFlyweightFactory.get("222")
  println("a2 = " + a2)
  println("a1 = " + a1)
  println(a2.equals(a1))
  val a3 = AccountFlyweightFactory.get("111")
  println("a3 = " + a3)
  println(a3.equals(a1))

//  Creating Corporate Account: 111
//  a1 = CorporateAccount(111,John111,true)
//  Creating Corporate Account: 222
//  a2 = CorporateAccount(222,John222,true)
//  a1 = CorporateAccount(111,John111,true)
//  false
//  a3 = CorporateAccount(111,John111,true)
//  true
}
