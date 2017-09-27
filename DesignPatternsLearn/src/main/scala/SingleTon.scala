/**
  * Created by hjw on 17/9/27.
  */
// 单例模式就控制类实例的个数，通过伴生对象来访问类的实例就提供了控制实例个数的机会
//class SingleTonEntity private声明了Worker的首构造函数是私有的，SingleTonEntity的所有构造函数都不能直接被外部调用，
// 因为所有从构造函数都会首先调用其他构造函数（可以是主构造函数，也可以是从构造函数），结果就是主构造函数是类的唯一入口点。
//另一方面，Worker.GetWorkInstance();有点类似静态函数调用，但在Scala中这是不对的。
// Scala会隐式地调用apply来创建一个伴生对象的实例。Scala是一个纯粹的面向对象语言，不允许有任何破坏对象模型的机制存在，比如类的静态变量、函数等。
class SingleTonEntity private(){
  def test(){
    println("---单例test---")
  }
}

object SingleTonEntity{
  val singleTonEntity = new SingleTonEntity
  def GetInstance() : SingleTonEntity = {
    singleTonEntity.test()
    singleTonEntity
  }
}

object SingleTon {
  def main(args: Array[String]) {
    val s1 = SingleTonEntity
    val s2 = SingleTonEntity
    println(s1)
    println(s2)
    if (s1.equals(s2) )
      println("---equal")
  }
  //SingleTonEntity$@5a39699c
  //SingleTonEntity$@5a39699c
  //---equal
}
