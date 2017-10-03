package ScalaDesignPatterns.Bridge.AbstractPart

import ScalaDesignPatterns.Bridge.Entity.Person
import ScalaDesignPatterns.Bridge.ImpletePart.DAOImplementor

/**
  * Created by hjw on 17/10/3.
  */
//sub trait PersonDAO that specifies the Person class
// as the type being managed and provides the self type reference to the DAOImplementor.
trait PersonDAO  extends DAO[Person]{
  // self type reference to the DAOImplementor.
  self:DAOImplementor[Person]=>
  override def persist(obj: Person): Unit = this.save(obj)

  override def findById(id: String): Option[Person] = this.get(id)

  override def deleteById(id: String): Unit = this.delete(id)
}
