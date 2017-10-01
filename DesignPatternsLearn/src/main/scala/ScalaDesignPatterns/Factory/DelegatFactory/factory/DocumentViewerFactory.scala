package Factory.DelegatFactory.factory

import Factory.DelegatFactory.delagat.DocumentViewer

import scala.collection.mutable.HashMap

/**
  * Created by hjw on 17/9/29.
  */
object DocumentViewerFactory extends Factory{
   //根据输入,选择具体的工厂
   var viewers = HashMap[String, String=>DocumentViewer]()

  override def create(s: String): DocumentViewer = {
    var pos = s.lastIndexOf("") //获取文件格式
    if(pos < 0) {
      pos = 0
    }
    val endsWith = s.substring(pos)
    val funcOption = viewers.get(endsWith)
    if(funcOption.nonEmpty){
      val func = funcOption.get
      return func(s)
    }else{
      throw new RuntimeException("Unknown Document Type")
    }
  }
}
