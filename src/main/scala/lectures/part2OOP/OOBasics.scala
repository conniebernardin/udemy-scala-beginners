package lectures.part2OOP

object OOBasics extends App {

  //instantiate person class using new keyword
  val person = new Person("Connie", 22)
  println(person)
  println(person.age)
  person.greet("Robyn")

}

//CONSTRUCTORS

//classes cn sit on top level code outside of main object
class Person(name: String, val age: Int) //class constructor
//age is a class parameter, not a field that can be accessed using the dot
//to make it a field, add the val or var to the parameter
{
  //class body. Can contain methods, expressions, definitions... basically everything
  //val or var definitions inside class are fields
  //at every instantiation of the class, the whole block of code is evaluated

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  //this.name access the instance name from the person class.
  //if you have a method wit no string/name parameter, then the this.name is implied

  //Multiple constructors defined by def 0
  def this(name: String) = this(name, 0) //sets default constructor age 0
  //easier to define default parameter to initial class constructor
}


//EXERCISES
class Novel(firstName: String, surname: String, year: Int)

