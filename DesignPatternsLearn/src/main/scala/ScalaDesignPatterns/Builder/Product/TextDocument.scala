package Builder.Product

import scala.collection.mutable.ListBuffer

/**
  * Created by hjw on 17/9/30.
  */
//TextDocument 产品 设置为trait 直接混入 Builder 或 Director
trait TextDocument  extends  Document{
  private var _text =  ListBuffer[String]()
  //清空内容
  def reset: Unit = _text = ListBuffer[String]()
  //内容展示
  def text = _text
}
