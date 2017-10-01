package Adapter.ClassTraitFormat

/**
  * Created by hjw on 17/9/30.
  */

//适配器类,继承Adaptee混入Server,重写Server的invoke方法(调用Adaptee的printer)
class Adaptor extends Adaptee with  Server{
  //重写Server的invoke方法(调用Adaptee的printer)
  override def invoke: Unit = printer
}

