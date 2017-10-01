package AbstractFactory.Product

import AbstractFactory.Product.trt.Window

/**
  * Created by hjw on 17/9/29.
  */

//具体的WinWindow产品
class WinWindow (val title:String,val x:Int = 0,val y:Int = 0) extends Window{

  override def toString = "WinWindow: " + title + "(" + x + ", " + y + ")"
}
