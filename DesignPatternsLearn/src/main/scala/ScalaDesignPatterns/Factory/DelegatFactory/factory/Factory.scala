package Factory.DelegatFactory.factory

import Factory.DelegatFactory.delagat.DocumentViewer

/**
  * Created by hjw on 17/9/29.
  */
//抽象工厂
//根据输入文本返回阅读器抽象对象
trait Factory {
  def create(s:String):DocumentViewer
}


