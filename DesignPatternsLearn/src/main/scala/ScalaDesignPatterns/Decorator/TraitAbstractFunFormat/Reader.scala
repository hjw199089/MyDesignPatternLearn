package Adapter.Decorator.TraitAbstractFunFormat

/**
  * Created by hjw on 17/10/1.
  *
The Reader trait is a trait defining the abstraction representing the Reader concept.
It defines a read method that returns a value of type T.
Note that in this case rather than using generics to create a parameterized class
we are using the type declaration mechanism in Scala to allow the type
to be returned to be specified by a sub type of Reader. Both generics and
this approach could have been used and this example merely provides an alternative to the generic approach.
  */

//阅读器Trait Marker
trait Reader {
  type T //允许在下游中定义
  def read:T //阅读功能函数
}
