package ScalaDesignPatterns.Facade.Product

/**
  * Created by hjw on 17/10/1.
  */

case class InterestRateSwap(val id: String,
                            val nominal:Double,
                            val fixedRate:Double,
                            val floatIndex:String
                          ) extends Product
