package Factory.DelegatFactory.delagat

/**
  * Created by hjw on 17/9/29.
  */

//OpenOfficeViewer具体的工厂
 object OpenOfficeViewer  extends DocumentViewerCompanion{
  override def create(s: String): DocumentViewer = OpenOfficeViewer(s)
}

 case class OpenOfficeViewer(var filename:String) extends DocumentViewer

