package ScalaDesignPatterns.Bridge.ImpletePart

import ScalaDesignPatterns.Bridge.Entity.Person

import scala.collection.mutable

/**
  * Created by hjw on 17/10/3.
  */
trait InMemoryImpletmentor extends DAOImplementor[Person] {
  private val data = mutable.HashMap[String, Person]()

  private var count = 0

  override def save(obj: Person): String = {
    count += 1
    val id = "p" + count
    data.put(id,obj)
    return id
  }

  override def get(id: String): Option[Person] = data.get(id)

  override def delete(id: String): Unit = data.remove(id)
}
