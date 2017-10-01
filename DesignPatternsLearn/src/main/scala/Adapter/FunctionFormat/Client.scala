package Adapter.FunctionFormat

/**
  * Created by hjw on 17/10/1.
  */

//现有的Client
class Client(server:Server) {
  def doWork:Unit={
    server.invoke
  }
}
