package AbstractFactory.Factory.trt

import AbstractFactory.Product.trt.{Menu, Window}

/**
  * Created by hjw on 17/9/29.
  */

//抽象UI工厂,生产一个产品簇
trait UIFactory extends Factory{
  //产品一 window
  def window(title:String):Window
  //产品二 menu
  def menu(title:String,shorcut:String):Menu
}


