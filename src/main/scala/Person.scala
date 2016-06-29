import scalafx.beans.property.{ObjectProperty, StringProperty}
import scalafx.scene.paint.Color

/**
  * Created by Administrator on 29/06/2016.
  */
class Person(firstName_ : String,
             lastName_ : String,
             favoriteColor_ : Color) {
  val firstName = new StringProperty(this, "firstName", firstName_)
  val lastName = new StringProperty(this, "lastName", lastName_)
  val favoriteColor = new ObjectProperty(this, "favoriteColor",
    favoriteColor_)
}