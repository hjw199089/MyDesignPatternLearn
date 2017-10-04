package ScalaDesignPatterns.Observer.Observer

import ScalaDesignPatterns.Observer.Observable.ObservableEvent

/**
  * Created by hjw on 17/10/4.
  */
case class Logger() extends Observer{
  def printer(e:ObservableEvent) = println(e)

}
