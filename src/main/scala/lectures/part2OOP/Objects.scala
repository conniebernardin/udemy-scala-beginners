package lectures.part2OOP

object Objects extends App {

  //defined in similar way as classes but do not take parameters
  object Person { //when you define an object you define its type and its only instance
    val numEyes = 2
    def canFly: Boolean = false

    //factory method
    //build persons given parameters
    //often called apply method
    def apply (mother: Person, father: Person): Person = new Person("Bobbie")
  }

  //common to write objects and classes with the same name
  //separates instance-level functionality (the class) from static functionality (the object)
  class Person(val name: String)

  val mary = Person
  val john = Person
  println(mary == john) //mary and john point to the same instance

  val kate = new Person("Catherine")
  val tony = new Person("Anthony")
  println(kate == tony) //point to different instances when instantiated by *new* class

  val bobbie = Person(kate, tony) //no need to specify apply method
}
