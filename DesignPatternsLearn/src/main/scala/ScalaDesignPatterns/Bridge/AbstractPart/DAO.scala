package ScalaDesignPatterns.Bridge.AbstractPart

/**
  * Created by hjw on 17/10/3.
  */
//Generic DAO trait
trait DAO[T]  extends Abstract{
  def persist(obj:T):Unit
  def findById(id:String):Option[T]
  def deleteById(id:String):Unit
}
