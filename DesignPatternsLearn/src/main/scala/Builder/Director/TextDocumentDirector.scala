package Builder.Director

import Builder.Builder.TextBuilder

/**
  * Created by hjw on 17/9/30.
  */

//Director暴露给用户参数接口
case class TextDocumentDirector()
  extends Director with TextBuilder {

  def addTitle(s: String): Unit = titile(s)

  def addAuthor(s: String): Unit = author(s)

  def addHeading(s: String): Unit = heading(s)

  def addPara(s: String): Unit = para(s)

}
