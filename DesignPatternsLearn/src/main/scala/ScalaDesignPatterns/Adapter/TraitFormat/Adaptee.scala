package Adapter.TraitFormat

/**
  * Created by hjw on 17/9/30.
  */

//需要适配的新类,将printer和Server的invoke适配
class Adaptee {
   def printer:Unit = {
     println("Adaptee is running")
   }
}

