package Adapter.TraitFormat

/**
  * Created by hjw on 17/9/30.
  */

//混入Server,同时隐式类型声明
trait Adaptor extends Server{
  //explicit self type statement
  self:Adaptee=>
  override def invoke: Unit = printer
}
