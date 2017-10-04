package ScalaDesignPatterns.Mediator.Event

import ScalaDesignPatterns.Mediator.Colleague.Colleague

/**
  * Created by hjw on 17/10/4.
  */
case class MouseEvent (s:Colleague,val x:Int, val y:Int,d:String) extends  Event(s,d){

}
