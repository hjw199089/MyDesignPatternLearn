package ScalaDesignPatterns.Observer.Observable

import scala.collection.mutable.ListBuffer

/**
  * Created by hjw on 17/10/4.
  */
/*
The Observable trait defines the changed method
that can be invoked by classes mixing in the trait to notify any observers of a change in the Observables state.
Each Observer is actually a callback function that matches the type defined by the ObserverCallback type
 */
//Observable者特质
trait Observable {
  //注册观察者
  type ObserverCallback = ObservableEvent => Unit
  val observers = ListBuffer[ObserverCallback]()
  //通知所有观察者
  def changed:Unit = {
    val event = ObservableEvent(this)//注册一个事件
    observers.foreach(_(event)) // 同事有事件变化
  }

}
