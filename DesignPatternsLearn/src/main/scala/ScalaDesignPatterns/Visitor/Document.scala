package ScalaDesignPatterns.Visitor

import ScalaDesignPatterns.Visitor.Visitable.Chapter
import ScalaDesignPatterns.Visitor.Visitor.ChapterVisitor

import scala.collection.mutable.ListBuffer

/**
  * Created by hjw on 17/10/9.
  */
case class Document (){
  val chapters = new ListBuffer[Chapter]()
  //用访问者去访问被访问者,而不需要知道其实现细节
  def tableOfContents:TOC = ChapterVisitor(chapters).toTOC
}
