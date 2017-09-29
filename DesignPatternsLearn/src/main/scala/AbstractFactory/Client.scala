package AbstractFactory

import AbstractFactory.Factory.FactoryProvider

/**
  * Created by hjw on 17/9/29.
  */
object Client extends App{

  val factory = FactoryProvider.factory

  println(factory.window("Main"))
  println(factory.menu("File", "CTRL-F"))

  //  OSXWindow: Main(0, 0)
  //  OSXMenu: File (CTRL-F)
}
