package ScalaDesignPatterns.Facade

import ScalaDesignPatterns.Facade.Facade.WriterFacade
import ScalaDesignPatterns.Facade.Product.{Load, EquityTrade, InterestRateSwap}

/**
  * Created by hjw on 17/10/1.
  */
//Client 通过WriterFacade,完成操作,WriterFacade中间接口完成具体的动作
object  Client extends App{
  val trade = EquityTrade("1","IBM",100)
  val irs = InterestRateSwap("2",1000,1.4,"LIBOR")
  val load = Load("3","John",1000)
  WriterFacade.save(trade)
  WriterFacade.save(irs)
  WriterFacade.save(load)
  //  MongoDBWriter.write: EquityTrade(1,IBM,100.0)
  //  TerradataWriter.save: EquityTrade(1,IBM,100.0)
  //  TerradataWriter.save: InterestRateSwap(2,1000.0,1.4,LIBOR)
  //  Default.writer: InterestRateSwap(2,1000.0,1.4,LIBOR)
  //  DB2Writer.store: Load(3,John,1000.0)

}
