package ScalaDesignPatterns.Decorator.TraitAbstractFunFormat

import Adapter.Decorator.TraitAbstractFunFormat.Decorator.{BufReaderDecorator, SynReaderDecorator}
import Adapter.Decorator.TraitAbstractFunFormat.FileReader

/**
  * Created by hjw on 17/10/1.
  */
object Test extends App{
   val filePath = "./src/main/scala/ScalaDesignPatterns/Decorator/TraitAbstractFunFormat/SrcFile/TestData.txt"

   //普通阅读器
   val reader = new FileReader(filePath)
   println(reader.read) //32
   //println(reader.read) //54

   //同步阅读器
   val synReader = new FileReader(filePath) with SynReaderDecorator
   println(synReader.read)

  //缓冲同步阅读器
  val bufSynReader =  new FileReader(filePath) with BufReaderDecorator with SynReaderDecorator
  println(bufSynReader.read)
}
