package Factory.DelegatFactory

import Factory.DelegatFactory.delagat.{JPEGViewer, OpenOfficeViewer, WordViewer}
import Factory.DelegatFactory.factory.DocumentViewerFactory

/**
  * Created by hjw on 17/9/29.
  */
object Client extends App{
  DocumentViewerFactory.viewers.put(".docx", WordViewer.create)
  DocumentViewerFactory.viewers.put(".odt", OpenOfficeViewer.create)
  DocumentViewerFactory.viewers.put(".jpg", JPEGViewer.create)

  val p1 = DocumentViewerFactory.create("info.docx")
  println(p1)
  val p2 = DocumentViewerFactory.create("info.odt")
  println(p2)
  val p3 = DocumentViewerFactory.create("info.jpg")
  println(p3)

//  WordViewer(info.docx)
//  OpenOfficeViewer(info.odt)
//  JPEGViewer(info.jpg)

}
