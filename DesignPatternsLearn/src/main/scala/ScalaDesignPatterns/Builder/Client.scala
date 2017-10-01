package Builder

import _root_.Builder.Director.TextDocumentDirector

/**
  * Created by hjw on 17/9/30.
  */
object Client extends App{
  //构建一个文本
  val text1_director = TextDocumentDirector()
  text1_director.addTitle("Scala V1")
  text1_director.addAuthor("hjw")
  text1_director.addHeading("Introduction")
  text1_director.addPara("This is Scala.")
  text1_director.addHeading("chapter 1")
  text1_director.addPara("Function")
  println(text1_director.text.mkString(" "))

  //构建另一个文本
  val text2_director = TextDocumentDirector()
  text2_director.addTitle("High Performance Spark")
  text2_director.addAuthor("hjw")
  text2_director.addHeading("Introduction")
  text2_director.addPara("This is Spark.")
  text2_director.addHeading("chapter 1")
  text2_director.addPara("Join")
  println(text2_director.text.mkString(" "))
}
