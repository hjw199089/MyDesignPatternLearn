package Adapter.PartialFunctionFormat

/**
  * Created by hjw on 17/10/1.
  */
//现有的客户端
class Client (server:Server){
  def doWork(s:String) = server.invoke(s)
}
