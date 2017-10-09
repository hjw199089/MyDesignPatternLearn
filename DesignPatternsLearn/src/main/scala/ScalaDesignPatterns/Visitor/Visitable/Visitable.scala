package ScalaDesignPatterns.Visitor.Visitable

import ScalaDesignPatterns.Visitor.Visitor.Visitor

/**
  * Created by hjw on 17/10/9.
  */
trait Visitable {
  def accept(v:Visitor):Unit

}
