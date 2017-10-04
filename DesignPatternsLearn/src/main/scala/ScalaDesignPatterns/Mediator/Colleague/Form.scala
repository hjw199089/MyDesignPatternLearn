package ScalaDesignPatterns.Mediator.Colleague

import ScalaDesignPatterns.Mediator.Event.{SaveEvent, ActionEvent, Event}
import ScalaDesignPatterns.Mediator.Mediator.EventMediator

/**
  * Created by hjw on 17/10/4.
  */
object Form extends Colleague{
  def receive(e:Event) = println("Form Receive event: " + e)
  def update = {
    println("Input changed")
    EventMediator.instance.notify(ActionEvent(this,"Updated doc"))

  }
  def save = EventMediator.instance.notify(SaveEvent(this,"Saved"))

}
