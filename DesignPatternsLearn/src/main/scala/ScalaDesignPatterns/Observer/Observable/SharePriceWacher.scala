package ScalaDesignPatterns.Observer.Observable

/**
  * Created by hjw on 17/10/4.
  */
//
case class SharePriceWacher(val share:String ) extends Observable{
 private var _value : Double = 0.0
  def value = _value
  def value_= (value: Double):Unit={
    _value=value
    changed
  }
  override def toString(): String = "curent value: " + _value
}

