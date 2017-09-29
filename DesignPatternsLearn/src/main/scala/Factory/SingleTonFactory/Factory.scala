package Factory.SingleTonFactory

/**
  * Created by hjw on 17/9/29.
  */
//抽象工厂,生产抽象的产品
trait Factory {
  //抽象的方法
  def create(a:Any):Product
}
