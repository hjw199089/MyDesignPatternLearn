package ScalaDesignPatterns.Visitor.Visitor

import ScalaDesignPatterns.Visitor.TOC
import ScalaDesignPatterns.Visitor.Visitable.{Visitable, Chapter}

import scala.collection.mutable.ListBuffer

/**
  * Created by hjw on 17/10/9.
  */
case class ChapterVisitor(chapters:ListBuffer[Chapter],
                          var count:Int = 1
                         ) extends Visitor{
  val toc:TOC = TOC()
  def toTOC:TOC  = {
    if(toc.isEmpty) {
      chapters.foreach((c:Chapter)=>{
        c.accept(ChapterVisitor.this);count += 1
      })
    }
    return toc
  }
}
