package Adapter.TraitFormat


/**
  * Created by hjw on 17/9/30.
  */
object Test extends App{
  //在应用中将Adaptee混入Adaptor完成适配
  val adaptor = new  Adaptee() with Adaptor
  val client:Client= new Client(adaptor)
  client.doWork
  //Adaptee is running
}
