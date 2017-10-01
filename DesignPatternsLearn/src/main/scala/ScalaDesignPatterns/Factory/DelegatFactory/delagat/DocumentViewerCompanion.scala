package Factory.DelegatFactory.delagat

/**
  * Created by hjw on 17/9/29.
  */
//抽象特质代理
trait DocumentViewerCompanion {
  def create(s:String):DocumentViewer
}
