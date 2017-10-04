package ScalaDesignPatterns.Mediator.Mediator

import scala.collection.mutable.ListBuffer

/**
  * Created by hjw on 17/10/4.
  */

/*
The Mediator trait defines a colleague’s property based on a ListBuffer
that holds a group of Colleague Callback functions. The actual format
of these call- backs is not defined in the Mediator trait; instead this
is defined as an abstract type that must be provided by a subtype of the Mediator trait.
It also defines an abstract method, notify, that will be used to pass data to all the colleagues via the callback functions.
 */
trait Mediator {
  type ColleagueCallback
  var colleagues = ListBuffer[ColleagueCallback]()
  //讲不同的事件通知过去
  def notify(any:Any) : Unit
}
