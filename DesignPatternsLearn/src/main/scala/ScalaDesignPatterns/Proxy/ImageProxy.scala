package ScalaDesignPatterns.Proxy

import javax.swing.ImageIcon

/**
  * Created by hjw on 17/10/2.
  */

//代理,持有lazy 的目标对象, 将目标对象的方法通过自己的方法向外暴露
case class ImageProxy(filename:String) extends Proxy with ImageProvider{

  println("Creating ImageProviderProxy ...")
  private lazy val server = new ImageServerProviderImpl(filename)
  val  image :ImageIcon= server.image // def 与 val转化
  override def toString: String = "Proxy for " + filename
}
