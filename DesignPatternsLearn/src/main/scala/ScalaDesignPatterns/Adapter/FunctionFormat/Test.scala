package Adapter.FunctionFormat

/**
  * Created by hjw on 17/10/1.
  */
object Test extends App{
  //Adaptor是单例对象
  val client = new Client(Adaptor)
  client.doWork
  //Adaptee is Running!.....
}
