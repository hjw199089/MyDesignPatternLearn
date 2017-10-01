package Adapter.Decorator.ObjectImplicitsFormat

/**
  * Created by hjw on 17/10/1.
  */
case class LabelWrapper(val name:String)

object LabelWrapper{
  //装饰者的作用
  implicit def convert(s:String):LabelWrapper = LabelWrapper("Having been Decorated: " + s)
}

object ObjectImplicit extends App{
  def printer(p:LabelWrapper) = println(p)

  import LabelWrapper._
  //隐式的将"John"转换成为LabelWrapper
  printer("John")
  //LabelWrapper(Having been Decorated: John)
}
