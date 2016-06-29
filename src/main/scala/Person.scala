import scala.collection.mutable.ArrayBuffer
import scalafx.beans.property.{IntegerProperty, ObjectProperty, StringProperty}
import scalafx.scene.paint.Color

/**
  * Created by Administrator on 29/06/2016.
  */
class Person(d: Int, quantity : Int, var status : OrderStatus.Value, var orderLine: ArrayBuffer[OrderLine],
             lastName_ : String,
             favoriteColor_ : Color) {
  val ID = new IntegerProperty(this, "ID", quantity)
  val Status = new ObjectProperty(this, "status", status)
  val lastName = new StringProperty(this, "lastName", lastName_)
  val favoriteColor = new ObjectProperty(this, "favoriteColor",
    favoriteColor_)
}