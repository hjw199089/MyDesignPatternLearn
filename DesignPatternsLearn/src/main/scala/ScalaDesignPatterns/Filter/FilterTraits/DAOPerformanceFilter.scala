package ScalaDesignPatterns.Filter.FilterTraits

import ScalaDesignPatterns.Filter.Dao.DAO

/**
  * Created by hjw on 17/10/3.
  */

trait DAOPerformanceFilter[T] extends Filter with DAO[T]{

  abstract override def save(a: T): Unit = {
    println("Starting  sava performance moniter: ")
    val start = System.nanoTime()
    super.save(a)
    printDuration(start)
  }

  abstract override def get(id: String): Option[T] = {
    println("Starting  get performance moniter: ")
    val start = System.nanoTime()
    val obj = super.get(id)
    printDuration(start)
    return obj
  }

  abstract override def delete(a: T): Unit = {
    println("Starting  delete performance moniter: ")
    val start = System.nanoTime()
    super.delete(a)
    printDuration(start)
  }

  private def printDuration(start:Double) = {
    val diff = (System.nanoTime() - start)/1000
    println("Performance " + diff + " microseconds")

  }
}
