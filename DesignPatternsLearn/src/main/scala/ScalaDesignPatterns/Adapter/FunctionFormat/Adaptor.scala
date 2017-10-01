package Adapter.FunctionFormat

/**
  * Created by hjw on 17/10/1.
  */

//单例适配器继承Server,将Adaptee已对象的形式组合,函数的替换方式完成适配
object Adaptor extends Server{
  val adaptee = new Adaptee()
  //函数对接形式完成适配
  override def invoke: Unit = adaptee.printer
}
