package ScalaDesignPatterns.Visitor

import scala.collection.mutable.ListBuffer

/**
  * Created by hjw on 17/10/9.
  */
/*
The TOC case class represents the Table Of Contents.
It allows strings to be added to the contents list it maintains.
It also provides a isEmpty method to check to see if the table
of contents exists yet and a toString to print out the contents list.
 */
case class TOC() {
  val contents = ListBuffer[String]()
  def ++(s:String) = contents append s
  def isEmpty = contents.isEmpty
  override def toString: String = "TOC: " + contents.toString
}
