package lectures.part2OOP

object AbstractDataTypes extends App {

  //Abstract Classes
  //classes that contain unimplemented methods are abstract
  abstract class Animal {
    val creatureType: String
    def eat(): Unit
  } //not instantiated with keyword new, but extended later

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat(): Unit = println("munch") //override keyword not necessary for compiler to understand
  }

  //trait
  //do not have constructor parameters
  //can extend multiple traits, but only one class
  //trait is a type of behaviour
  trait Carnivore {
    val diet: String = "meat" //non-abstract trait member
    def eat(animal: Animal): Unit //traits can also have abstract field
    //but abstract fields can be inherited along classes
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "croc"
    override def eat(): Unit = println("nomnomnom")
    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating a ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)


}
