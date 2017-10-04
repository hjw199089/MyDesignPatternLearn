package ScalaDesignPatterns.Mediator.Colleague


import ScalaDesignPatterns.Mediator.Event.{MouseEvent, SaveEvent, ActionEvent, Event}
import ScalaDesignPatterns.Mediator.Mediator.EventMediator

/**
  * Created by hjw on 17/10/4.
  */
object Fram extends Colleague{
  var requiresSave = false
  def handleEvent(e:Event) :Unit = e match {
    case e:MouseEvent if e.source == this => println("Do nothing event from self")
    case _:MouseEvent => println("Some other MouseEvent")
    case _: ActionEvent => requiresSave = true ; println("Frame Requires save")
    case _:SaveEvent => requiresSave = false; println("Frame Save reset")
    case _ => println("Frame recieved 'Other' Event ")
  }
  def input = EventMediator.instance.notify(MouseEvent(this,10,10,"Clicked"))

}
