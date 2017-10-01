package ScalaDesignPatterns.Facade.Product

/**
  * Created by hjw on 17/10/1.
  */
case class Load(val id:String,
                val borrower:String,
                val facility:Double
               )extends Product
