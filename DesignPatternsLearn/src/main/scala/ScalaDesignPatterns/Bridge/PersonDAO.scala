package ScalaDesignPatterns.Bridge

import ScalaDesignPatterns.Bridge.AbstractPart.PersonDAO
import ScalaDesignPatterns.Bridge.ImpletePart.InMemoryImpletmentor

/**
  * Created by hjw on 17/10/3.
  */
/*
Finally the PersonDAL Object brings the two hierarchies together.
Note a class could also have been used an instance created which would be necessary
if multiple instances of the implementation are required,

however the in memory data storage mechanism should be shared across all parts of the application
so a singleton object is being used instead.
The implementation of this Object is trivial in that
it is defined purely to mix together the two trait hierarchies
in the form of the PersonDAO trait and the InMemoryDAOImplementor
 */
object PersonDAO extends PersonDAO with InMemoryImpletmentor{

}
