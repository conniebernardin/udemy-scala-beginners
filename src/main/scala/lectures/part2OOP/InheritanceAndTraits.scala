package lectures.part2OOP

object InheritanceAndTraits extends App {

//single class inheritance - only extend one class at a time
  class Animal {
    def eat = println("Nomnomnom")
  }

  class Cat extends Animal

  val cat = new Cat
  cat.eat

}
