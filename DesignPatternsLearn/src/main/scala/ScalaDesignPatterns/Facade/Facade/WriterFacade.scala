package ScalaDesignPatterns.Facade.Facade

import ScalaDesignPatterns.Facade.FacadeMembers.{DB2Writer, DefaultWriter, TerradataWriter, MongoDBWriter}
import ScalaDesignPatterns.Facade.Product.{Load, InterestRateSwap, EquityTrade}

/**
  * Created by hjw on 17/10/1.
  */
/*
The WriterFacade object mixes in the Façade trait and
implements the save method which acts as an interface
between the clients of the WriterFacade and the members of the façade.
Pattern matching is used to determine the actual type of the parameter and to decide the action required
 */

//WriterFacade 单例
object WriterFacade extends Facade {
  def save(product: Product): Unit = product match {
    case trade: EquityTrade => {
      MongoDBWriter.write(trade);
      TerradataWriter.save(trade)
    }
    case irs: InterestRateSwap => {
      TerradataWriter.save(irs); DefaultWriter.write(irs)
    }
    case load:Load=>DB2Writer.store(load)
    case _=>DefaultWriter.write(product)
  }

}
