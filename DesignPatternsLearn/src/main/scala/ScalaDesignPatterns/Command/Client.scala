package ScalaDesignPatterns.Command

/**
  * Created by hjw on 17/10/3.
  */
object Client extends App {
  val exec = Excutor()
  val sayHello = () => println("Hell0")
  exec.execute(sayHello)
  val x = 10
  exec.execute(() => println(x * 3))
  println(exec)
  exec.rerun
  //Hell0
  //30
  //Executor: ListBuffer(<function0>, <function0>)
  //Hell0
  //30
}
