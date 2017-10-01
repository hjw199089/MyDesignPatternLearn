package Adapter.Decorator.TraitAbstractFunFormat.Decorator

import Adapter.Decorator.TraitAbstractFunFormat.Reader

/**
  * Created by hjw on 17/10/1.
  */
//装饰方式二: 添加缓冲功能
trait BufReaderDecorator extends Reader with Decorator{
  //允许在下游中定义
  abstract override def read: T ={
    //添加buffering功能部分的code
    super.read
  }
}
