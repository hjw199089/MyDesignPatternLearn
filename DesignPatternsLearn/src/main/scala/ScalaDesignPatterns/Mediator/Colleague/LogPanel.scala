package ScalaDesignPatterns.Mediator.Colleague

import ScalaDesignPatterns.Mediator.Event.Event

/**
  * Created by hjw on 17/10/4.
  */
object LogPanel extends Colleague{
  def log(e:Event):Unit = println("Logger: " + e)
}
