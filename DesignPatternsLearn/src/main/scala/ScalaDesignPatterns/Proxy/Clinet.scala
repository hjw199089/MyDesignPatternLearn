package ScalaDesignPatterns.Proxy

/**
  * Created by hjw on 17/10/2.
  */
object Clinet extends App{
  //使用时通过代理构建对象
  val proxy = ImageProxy("help.jpg")
  println(proxy)
  //通过代理对外暴露的方法访问对象的方法
  val image = proxy.image
  println(image)
  //  Creating ImageProviderProxy ...
  //  Creating ImageServerProviderImpl ...
  //  Proxy for help.jpg
  //  help.jpg
}
