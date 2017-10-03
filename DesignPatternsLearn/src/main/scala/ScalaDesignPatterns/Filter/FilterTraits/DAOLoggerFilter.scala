package ScalaDesignPatterns.Filter.FilterTraits

import ScalaDesignPatterns.Filter.Dao.DAO

/**
  * Created by hjw on 17/10/3.
  */

/*
 DAOLoggerFilter.
This is a generic trait which extends the Filter trait and mixes in the DAO trait.
It overrides the save, delete and get methods of the DAO trait.
Each method prints a logging message and then calls the method on the super keyword.
Note that the methods are all marked as abstract override.
This indicates that they are only partial implemen- tations of the method,
something else must be provided to complete the implemen- tation.
This is indicated by the call to super. <method name>.
This invocation causes any other wrapped traits to be invoked
(or if no further traits are available) the target object.
It is thus this feature that implements the filter chain behaviour of the Filter Pattern in this example.
 */
trait DAOLoggerFilter[T] extends Filter with DAO[T]{

  abstract  override def save(a: T) = {
    println("Logger sava: " + a)
    super.save(a)
  }

  abstract override def get(id: String): Option[T] = {
    println("Logger get: " + id)
    super.get(id)
  }

  abstract override def delete(a: T) = {
    println("Logger delete: " + a)
    super.delete(a)
  }
}
