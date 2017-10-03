package ScalaDesignPatterns.Bridge

import ScalaDesignPatterns.Bridge.Entity.Person

/**
  * Created by hjw on 17/10/3.
  */
object Client extends App{
  println("Create Person")
  val p1 = Person("John",49)
  println(p1)
  println("Person persist")
  PersonDAO.persist(p1)

  println("Petrieve  Person by ID")
  val p2 = PersonDAO.findById("p1")
  println(p2)
  println("Delete Person")
  PersonDAO.deleteById("p1")
  println("Try to find  Person again by ID")
  val p3 = PersonDAO.findById("p1")
  println(p3)
  //Create Person
  //Person(John,49)
  //Person persist
  //Petrieve  Person by ID
  //Some(Person(John,49))
  //Delete Person
  //Try to find  Person again by ID
  //None
}
