package ScalaDesignPatterns.Facade.FacadeMembers

import ScalaDesignPatterns.Facade.Product.Load

/**
  * Created by hjw on 17/10/1.
  */
object DB2Writer {
  def store(load: Load): Unit = println("DB2Writer.store: " + load)

}
