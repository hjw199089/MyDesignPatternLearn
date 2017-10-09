package ScalaDesignPatterns.Visitor.Visitable

import ScalaDesignPatterns.Visitor.Visitor.{ChapterVisitor, Visitor}

/**
  * Created by hjw on 17/10/9.
  */
/*
 defines a chapter as having a title and a Set of headings.
 被访问者,自己根据自己的内部构成反馈给访问者,访问者不需知道被访问者的构成细节
 */
case class Chapter(val title: String,
                   val headings: Set[String]
                  ) extends Visitable {
  override def accept(v: Visitor): Unit = v match {
    case tocVistor: ChapterVisitor => {
      tocVistor.toc ++ (tocVistor.count + ". " + this.title + "\n") // 本chapter的title
      //访问本Chapter的heading
      var headingCount = 1
      headings.foreach(
        (heading:String)=>{
          tocVistor.toc ++ (tocVistor.count +
            "." +
            headingCount +
            " " + headings  + "\n")
          headingCount += 1
        })
    }
  }
}
