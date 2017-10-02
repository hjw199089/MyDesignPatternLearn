package ScalaDesignPatterns.Proxy

import javax.swing.ImageIcon

/**
  * Created by hjw on 17/10/2.
  */

//ImageProvider 特质接口
trait ImageProvider {
  val filename:String
  val image:ImageIcon
}
