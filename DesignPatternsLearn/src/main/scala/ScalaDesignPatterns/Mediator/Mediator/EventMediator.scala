package ScalaDesignPatterns.Mediator.Mediator

import ScalaDesignPatterns.Mediator.Event.Event

/**
  * Created by hjw on 17/10/4.
  */
case class EventMediator() extends Mediator{
  override type ColleagueCallback = Event => Unit

  //讲不同的事件通知过去
  override def notify(e: Any): Unit = e match {
    case event:Event => (colleagues clone).foreach(_(event)) // Event => Unit
    case _=>throw new RuntimeException("Invalid Mediator type")
  }
}

object EventMediator{
  val instance  = EventMediator()
}
