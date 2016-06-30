/**
  * Created by Administrator on 28/06/2016.
  */
import scala.collection.mutable.ArrayBuffer



/**
  * Created by MacZ on 17/06/2016.
  */
class Inventory () {
  //stuff

  val stockInventory = new ArrayBuffer[InventoryItem]
  stockInventory+=angryGnome
  stockInventory+=grebeGnome
  stockInventory+=sunglassesGnome
  stockInventory+=fishingGnome
  stockInventory+=mechanicGnome
  stockInventory+=dancingGnome
  stockInventory+=hologramGnome

  stockInventory+=wDeckChairs
  stockInventory+=sunShineUmbrella
  stockInventory+=waterBottles

  stockInventory+=dragonGnome
  stockInventory+=sailorGnome
  stockInventory+=suitGnome
  stockInventory+=casualGnome
  stockInventory+=policeGnome
  stockInventory+=fireFighterGnome
  stockInventory+=doctorGnome

  stockInventory+=hammock
  stockInventory+=wheelbarrow
  stockInventory+=sprinkler

  val angryGnome = InventoryItem(1,"Angry Gnome", 10.0, 35, 15, 11.20)
  val grebeGnome = InventoryItem(2,"Grebe Gnome", 20.0, 13, 9, 10.90)
  val sunglassesGnome = InventoryItem(3,"Sunglasses Gnome", 13.0, 21, 11, 12.10)
  val fishingGnome = InventoryItem(4,"Fishing Gnome", 7.0, 32, 16, 14.00)
  val mechanicGnome = InventoryItem(5,"Mechanic Gnome", 8.0, 29, 16, 15.70)
  val dancingGnome = InventoryItem(6,"Mechanic Gnome", 12.0, 30, 14, 18.30)
  val hologramGnome = InventoryItem(7,"Hologram Gnome", 17.0, 24, 10, 11.0)
  val wDeckChairs = InventoryItem(8, "Wooden Deck Chairs", 7.0, 45, 0, 2)
  val sunShineUmbrella = InventoryItem(9, "Sunshine Umbrella", 6, 56, 0, 1.10)
  val waterBottles = InventoryItem(10, "Water Bottles", 4, 120, 0, 1.0)

  val dragonGnome = InventoryItem(11,"Dragon Gnome", 21.0, 19, 10, 14.20)
  val sailorGnome = InventoryItem(12,"Sailor Gnome", 20.0, 27, 12, 16.90)
  val suitGnome = InventoryItem(13,"Suit Gnome", 13.0, 28, 16, 12.10)
  val casualGnome = InventoryItem(14,"Casual Gnome", 5.0, 38, 12, 9.90)
  val policeGnome = InventoryItem(15,"Police Gnome", 8.0, 26, 14, 8.70)
  val fireFighterGnome = InventoryItem(16,"Firefighter Gnome", 12.0, 34, 17, 9.30)
  val doctorGnome = InventoryItem(17,"Doctor Gnome", 17.0, 24, 22, 8.90)
  val hammock = InventoryItem(18, "Hammock", 30.0, 31, 0, 3.10)
  val wheelbarrow = InventoryItem(19, "Wheel Barrow", 17.0, 29, 0, 4.10)
  val sprinkler = InventoryItem(20, "Sprinkler", 15.0, 25, 0, 5.60)

  def getProductById(id:Int) = stockInventory.find(_.ID == id)


  def printList(): Unit = {

    //for (i<- 0 to (list.length - 1) ){
    for (i <- stockInventory.indices ){
      val prod = stockInventory(i)
      println("ID : " + prod.ID + " | Name: " + prod.Name + " | Price:" + prod.Price +
        " | Quantity: " + prod.Quantity + " | Quantiy of Porus: " + prod.QuantityPorus
        + " | Location:" + prod.Location)
    }
  }

  def printListIndividual(input: Int): String = {

    val prod  = stockInventory(input)
    "ID : " + prod.ID + " | Name: " + prod.Name + " | Price:" + prod.Price +
      " | Quantity: " + prod.Quantity + " | Quantiy of Porus: " + prod.QuantityPorus +
      " | Location:" + prod.Location
  }

  def getInventoryList(): ArrayBuffer[InventoryItem] = {

    stockInventory
  }

  def decrementStock(itemID: Int, deduction: Int): Unit = {
    stockInventory(itemID).Quantity -= deduction
  }

  def decrementPorusStock(itemID: Int, deduction:Int): Unit ={
    stockInventory(itemID).QuantityPorus -= deduction
  }

}

