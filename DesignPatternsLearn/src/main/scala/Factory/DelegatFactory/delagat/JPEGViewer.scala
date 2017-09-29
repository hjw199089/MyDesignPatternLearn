package Factory.DelegatFactory.delagat

/**
  * Created by hjw on 17/9/29.
  */

 object JPEGViewer extends DocumentViewerCompanion{
  override def create(s: String): DocumentViewer = JPEGViewer(s)
}

 case class JPEGViewer(var filename:String) extends DocumentViewer