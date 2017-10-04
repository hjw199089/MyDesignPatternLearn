package ScalaDesignPatterns.Observer

import ScalaDesignPatterns.Observer.Observable.SharePriceWacher
import ScalaDesignPatterns.Observer.Observer.Logger

/**
  * Created by hjw on 17/10/4.
  */
object Client extends App{
  //被观测者
  val watcher = SharePriceWacher("Google")
  //观察者
  val logger = Logger()

  //将观察者注册到被观察者中
  watcher.observers.append(logger.printer)
  watcher.value = 32.0
  //ObservableEvent(curent value: 32.0)
}
