package Adapter.PartialFunctionFormat

/**
  * Created by hjw on 17/10/1.
  */
//带适配的Adaptee,两个String形式的入参
class Adaptee {
  def printer(title:String,name:String)=println(title + " " + name)
}
