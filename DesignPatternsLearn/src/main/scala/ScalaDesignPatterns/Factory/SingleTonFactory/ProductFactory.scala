package Factory.SingleTonFactory

/**
  * Created by hjw on 17/9/29.
  */
//单例的具体工厂
object ProductFactory {
  //提供隐式方法
  //这里用match,也是前面不同具体工厂用case class的原因
   implicit def create(a:Any):Product= a match{
    case s:String  => ConreteProduct(s)
    case i:Int => AlternativeProduct(i)
  }
}
