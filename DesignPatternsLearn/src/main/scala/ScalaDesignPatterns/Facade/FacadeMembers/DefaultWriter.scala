package ScalaDesignPatterns.Facade.FacadeMembers

/**
  * Created by hjw on 17/10/1.
  */
object DefaultWriter {
  def write(p:Product):Unit=println("Default.writer: " + p)
}
