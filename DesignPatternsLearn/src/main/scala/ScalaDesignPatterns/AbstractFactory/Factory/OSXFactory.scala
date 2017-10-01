package AbstractFactory.Factory

import AbstractFactory.Factory.trt.UIFactory
import AbstractFactory.Product.{OSXMenu, OSXWindow}
import AbstractFactory.Product.trt.{Window, Menu}

/**
  * Created by hjw on 17/9/29.
  */

//OSXFactory具体工厂
case class OSXFactory() extends UIFactory{
  //产品一 window
  override def window(title: String): Window = new OSXWindow(title)

  //产品二 menu
  override def menu(title: String, shorcut: String): Menu = new OSXMenu(title,shorcut)
}
