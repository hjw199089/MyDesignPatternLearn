package ScalaDesignPatterns.Filter

import ScalaDesignPatterns.Filter.Dao.PersonDAO
import ScalaDesignPatterns.Filter.FilterTraits.{DAOLoggerFilter, DAOPerformanceFilter}

/**
  * Created by hjw on 17/10/3.
  */
object Client extends App {

  val dao = new PersonDAO
    with DAOPerformanceFilter[Person]
    with DAOLoggerFilter[Person]
    dao.save(Person("1","John",49))
  val p = dao.get("1")
  if (p.nonEmpty) dao.delete(p.get)

  //  Logger sava: Person(1,John,49)
  //  Starting  sava performance moniter:
  //    PersonDAO.save
  //  Performance 60.619 microseconds
  //  Logger get: 1
  //  Starting  get performance moniter:
  //    PersonDAO.get
  //  Performance 77.614 microseconds
  //  Logger delete: Person(1,John,49)
  //  Starting  delete performance moniter:
  //    PersonDAO.delete
  //  Performance 58.241 microseconds


}
