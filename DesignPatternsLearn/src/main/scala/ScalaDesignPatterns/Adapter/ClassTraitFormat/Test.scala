package Adapter.ClassTraitFormat

/**
  * Created by hjw on 17/9/30.
  */

object Test extends App{
   //Adaptor继承Adaptee 混入 Server
  val adaptor :Adaptor = new Adaptor()

  val client:Client = new Client(adaptor)

  client.doWork
  //Adaptee is running
}
