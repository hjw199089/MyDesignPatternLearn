package Adapter.PartialFunctionFormat

/**
  * Created by hjw on 17/10/1.
  */

//单例适配器,继承+偏函数
object Adaptor extends Adaptee with Server {
  //val invoke:String=>Unit
  val invoke = printer("Dr" ,  _:String)
}
