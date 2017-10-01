package Adapter.PartialFunctionFormat

/**
  * Created by hjw on 17/10/1.
  */
//现有的Server,只有一个String形式的入参
trait Server {
  val invoke:String=>Unit
}
