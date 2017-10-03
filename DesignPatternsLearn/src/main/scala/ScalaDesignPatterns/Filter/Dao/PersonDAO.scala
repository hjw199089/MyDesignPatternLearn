package ScalaDesignPatterns.Filter.Dao

import ScalaDesignPatterns.Filter.Person

import scala.collection.mutable.HashMap

/**
  * Created by hjw on 17/10/3.
  */

//通用的原始PersonDAO工具类
class PersonDAO extends DAO[Person] {
  //存储
  private val data = HashMap[String, Person]()

  override def save(p: Person): Unit = {
    println("PersonDAO.save")
    data.put(p.id, p)
  }

  override def get(id: String): Option[Person] = {
    println("PersonDAO.get")
    data.get(id)
  }

  override def delete(p: Person): Unit = {
    println("PersonDAO.delete")
    data.remove(p.id)
  }
}
