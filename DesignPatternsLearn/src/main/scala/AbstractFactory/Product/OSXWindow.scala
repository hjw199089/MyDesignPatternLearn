package AbstractFactory.Product

import AbstractFactory.Product.trt.Window

/**
  * Created by hjw on 17/9/29.
  */

//具体的OSXWindow产品
class OSXWindow (val title:String,val x:Int = 0,val y:Int = 0) extends Window{
  override def toString = "OSXWindow: " + title + "(" + x + ", " + y + ")"
}
