package ScalaDesignPatterns.Facade.Product

/**
  * Created by hjw on 17/10/1.
  */
case class EquityTrade(val id:String,
                         val stock:String,
                         val quantity:Double
                        ) extends Product

