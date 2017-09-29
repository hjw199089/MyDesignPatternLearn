package Factory.DelegatFactory.delagat

/**
  * Created by hjw on 17/9/29.
  */

//WordViewerd具体的工厂
//这里和java有点区别 直接用单例对象做工厂即可
object WordViewer extends DocumentViewerCompanion{
  override def create(s: String): DocumentViewer = WordViewer(s)
}

  case class WordViewer(var filename:String) extends DocumentViewer
