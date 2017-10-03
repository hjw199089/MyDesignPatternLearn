package ScalaDesignPatterns.Command

import ScalaDesignPatterns.Command.command.Command

import scala.collection.mutable.ListBuffer

/**
  * Created by hjw on 17/10/3.
  */
case class Excutor (val history:ListBuffer[Command] = ListBuffer[Command]()){
  def rerun = history.foreach((_()))
  def execute(cmd:Command) = {history.append(cmd); cmd()}

  override def toString: String = "Executor: " + history
}
