package Adapter.ClassTraitFormat

/**
  * Created by hjw on 17/9/30.
  */

//现有的Client
class Client (server: Server){
  def doWork = {
    server.invoke
  }
}
