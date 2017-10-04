package ScalaDesignPatterns.Strategy

import ScalaDesignPatterns.Strategy.strategy.Strategy


/**
  * Created by hjw on 17/10/4.
  */
trait Calculator {
  //持有一个方法对象
  private[Strategy] var strategy:Strategy
  def calc(o:Person):Long = strategy(o)
}
