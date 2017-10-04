package ScalaDesignPatterns.Strategy



/**
  * Created by hjw on 17/10/4.
  */
case class TaxCalculator() extends Calculator{
  //thus the strategy to apply can be altered during the lifetime of a TaxCalculator object.
 var strategy = (e:Person) => Math.ceil(e.salary * .3).toLong
}
