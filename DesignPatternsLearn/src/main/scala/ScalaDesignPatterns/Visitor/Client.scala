package ScalaDesignPatterns.Visitor

import ScalaDesignPatterns.Visitor.Visitable.Chapter

/**
  * Created by hjw on 17/10/9.
  */
object Client extends App {
 val doc = Document()
  val c1 = Chapter("Introduction",Set("One","Two","Three"))
  val c2 = Chapter("Scala",Set("History","Infuences","Sample"))
  doc.chapters.append(c1)
  doc.chapters.append(c2)
  //通过给定的访问者访问内容
  println(doc.tableOfContents)

//  TOC: ListBuffer(1. Introduction
//  , 1.1 Set(One, Two, Three)
//  , 1.2 Set(One, Two, Three)
//  , 1.3 Set(One, Two, Three)
//  , 2. Scala
//  , 2.1 Set(History, Infuences, Sample)
//  , 2.2 Set(History, Infuences, Sample)
//  , 2.3 Set(History, Infuences, Sample)
//  )
}
