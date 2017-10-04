package ScalaDesignPatterns.Strategy

/**
  * Created by hjw on 17/10/4.
  */
object Client  extends App{
  val p = Person(24000)
  val tc = TaxCalculator()
  println(tc.calc(p))
  //改变策略
  tc.strategy = (e:Person)=>Math.ceil(e.salary * .5).toLong
  println(tc.calc(p))
  //  7200
  //  12000
}
