package lectures.part2OOP

object Inheritance extends App {

//single class inheritance - only extend one class at a time
  class Animal {
  val creatureType = "wild"
    def eat = println("Nomnomnom")
  }

  class Cat extends Animal

  val cat = new Cat
  cat.eat


  //constructors
  //JVM calls constructor of parent class before any class it extends
  class Person(name: String, age: Int){
    def this(name: String) = this(name, 0) //auxiliary constructor
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)



//overriding
class Dog extends Animal {
  override def eat: Unit = println("crunch crunch")

  override val creatureType: String = "domestic"
}

val dog = new Dog
dog.eat
  println(dog.creatureType)

  //fields can be override in the constructor as well as the body, unlike methods



  /*making a class final - cannot be extended
  * making a class sealed - cannot be extended outside current file */

}