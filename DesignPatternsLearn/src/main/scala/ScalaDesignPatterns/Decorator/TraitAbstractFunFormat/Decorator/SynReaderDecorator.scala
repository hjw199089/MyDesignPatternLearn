package Adapter.Decorator.TraitAbstractFunFormat.Decorator

import Adapter.Decorator.TraitAbstractFunFormat.Reader

/**
  * Created by hjw on 17/10/1.
  */
//装饰方式一: 添加同步功能
//继承Read和Decorator,抽象方式的扩展功能
//主要是为了混入下游的某一个类,所以用super调用某个未知下游的方法(abstract + super)
trait SynReaderDecorator extends Reader with Decorator{
  //允许在下游中定义(abstract + super)
  abstract override def read: T = synchronized(super.read)
}
