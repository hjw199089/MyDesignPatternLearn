package ScalaDesignPatterns.Filter.Dao

/**
  * Created by hjw on 17/10/3.
  */

/*
The DAO trait represents the Abstraction being implemented.
This trait is a generic trait that can save,
delete and get (retrieve) objects of the generic type T.
 */
trait DAO[T] {
  def save(a:T):Unit
  def delete(a:T):Unit
  def get(id:String):Option[T]

}
