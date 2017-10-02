package ScalaDesignPatterns.Flyweight

import scala.collection.mutable

/**
  * Created by hjw on 17/10/2.
  */

//单例工厂
object AccountFlyweightFactory {

  //若已存在直接取用,没有才新建
  val map = new mutable.HashMap[String, Account]()

  def get(number: String): Account = {
    map.getOrElseUpdate(number, CorporateAccount(number,
      retrieveNumber(number)))}

  private def retrieveNumber(number:String):String={
    return "John" + number
  }

}
