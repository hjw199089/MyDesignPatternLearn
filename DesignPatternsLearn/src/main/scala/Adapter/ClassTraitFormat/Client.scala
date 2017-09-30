package Adapter.ClassTraitFormat

/**
  * Created by hjw on 17/9/30.
  */
class Client (server: Server){
  def doWork = {
    server.invoke
  }
}
