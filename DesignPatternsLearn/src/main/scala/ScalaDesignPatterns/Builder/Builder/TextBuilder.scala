package Builder.Builder

import Builder.Product.TextDocument

/**
  * Created by hjw on 17/9/30.
  */
trait TextBuilder  extends Builder with TextDocument {
  private var count = 0
  //构建各部分
  def titile (t:String):Unit = text +=  "title: " + t + "\n"
  def author(a: String):Unit = text +=  "by " + a + "\n\n"
  def heading(h: String):Unit = text +=  { count += 1; count + " " + h + "\n" }
  def para(p: String) :Unit = text +=  p + "\n"
}
