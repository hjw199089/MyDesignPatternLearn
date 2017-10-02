package ScalaDesignPatterns.Proxy

import javax.swing.ImageIcon

/**
  * Created by hjw on 17/10/2.
  */
//The ImageServiceImpl is a class that implements
//the functionality required to load an Image as
//specified by the ImageService trait.
//It is private to the package and is thus not visible outside of the Proxy package.
//It possesses a private member _ image which is used to hold the ImageIcon
//created to represent the required image. This object is returned as the result of the image method.

private class ImageServerProviderImpl(val filename:String) extends ImageProvider with Server{

  println("Creating ImageServerProviderImpl ...")

  private val _image = new ImageIcon(filename)

  override val image: ImageIcon = _image
}

