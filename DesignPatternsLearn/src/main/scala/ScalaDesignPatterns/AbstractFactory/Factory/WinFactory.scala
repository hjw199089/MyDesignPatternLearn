package AbstractFactory.Factory

import AbstractFactory.Factory.trt.UIFactory
import AbstractFactory.Product.{WinMenu, WinWindow}
import AbstractFactory.Product.trt.{Window, Menu}

/**
  * Created by hjw on 17/9/29.
  */


//WinFactory具体工厂
case class WinFactory()  extends UIFactory{
  //产品一 window
  override def window(title: String): Window = new WinWindow(title)
  //产品二 menu
  override def menu(title: String, shorcut: String): Menu = new WinMenu(title,shorcut)
}
