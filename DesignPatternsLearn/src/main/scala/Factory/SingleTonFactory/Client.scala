package Factory.SingleTonFactory

/**
  * Created by hjw on 17/9/29.
  */
object Client extends App{
  val a  = ProductFactory.create("John")
  println(a)
  val b = ProductFactory.create(32)
  println(b)

  //隐式转化
  import ProductFactory._
  val c:Product = "Adam"
  println(c)
  val d:Product = 22
  println(d)
  //  ConreteProduct(John)
  //  AlternativeProduct(32)
  //  ConreteProduct(Adam)
  //  AlternativeProduct(22)

}
