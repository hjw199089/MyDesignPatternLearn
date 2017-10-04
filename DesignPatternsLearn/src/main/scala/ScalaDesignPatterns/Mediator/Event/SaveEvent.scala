package ScalaDesignPatterns.Mediator.Event

import ScalaDesignPatterns.Mediator.Colleague.Colleague

/**
  * Created by hjw on 17/10/4.
  */
case class SaveEvent (s:Colleague,d:String) extends Event(s,d){

}
