package AbstractFactory.Factory

import AbstractFactory.Factory.trt.UIFactory

import scala.collection.immutable.HashMap

/**
  * Created by hjw on 17/9/29.
  *
  * The factory of factories object,
  * here called the Factory Provider is a Scala Object
  * (as the singleton nature of the Scala Object is beneficial in this situation).
  * The Factory Provider sets up the available factories
  * (note that this information could be loaded form a configuration
  * file or the object could be programmatically configured if required).
  * When a request is made for a factory it either uses a system property to
  * determine the appropriate factory to return or returns the default
  * factory (which in this case is the OSXFactory).
  */

//工厂提供者,避免client中的工厂选择
//单例模式
object FactoryProvider {
  //选择具体的工厂
  private val default =  OSXFactory()
  private val  factories =   HashMap[String,UIFactory]("WIn"-> WinFactory(),"OSX"->default)

  def factory = factories.getOrElse(System.getProperty("factory"), default)
}
