package ScalaDesignPatterns.Bridge.ImpletePart

/**
  * Created by hjw on 17/10/3.
  */
trait DAOImplementor[T] extends Implement{
  def save(obj:T):String
  def delete(id:String):Unit
  def get(id:String):Option[T]
}
