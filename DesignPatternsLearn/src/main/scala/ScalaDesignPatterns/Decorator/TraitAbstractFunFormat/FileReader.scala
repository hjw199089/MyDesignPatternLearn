package Adapter.Decorator.TraitAbstractFunFormat

import java.io.FileInputStream
import java.util.Scanner

/**
  * Created by hjw on 17/10/1.
  */

//现有的文件阅读器,待被装饰
class FileReader(filename:String) extends Reader with Server{

  private val scanner = new Scanner(new FileInputStream(filename))

  override type T = Int

  //允许在下游中定义
  override def read: T = {
    scanner.nextInt()
  }
}
