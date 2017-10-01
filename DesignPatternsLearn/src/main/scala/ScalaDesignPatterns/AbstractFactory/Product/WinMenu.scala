package AbstractFactory.Product

import AbstractFactory.Product.trt.Menu

/**
  * Created by hjw on 17/9/29.
  */

//具体的WinMenu产品
class WinMenu(val title:String, val shortcut:String)extends Menu{

  override def toString =  "WinMenu: " + title + " (" + shortcut + ")"
}
