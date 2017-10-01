package ScalaDesignPatterns.Facade.FacadeMembers

import ScalaDesignPatterns.Facade.Product.EquityTrade

/**
  * Created by hjw on 17/10/1.
  */
object MongoDBWriter {
  def write(trade:EquityTrade):Unit = println("MongoDBWriter.write: " + trade)
}
