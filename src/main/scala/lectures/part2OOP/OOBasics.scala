package lectures.part2OOP

import java.io.Writer

object OOBasics extends App {

  //instantiate person class using new keyword
  val person = new Person("Connie", 22)
//  println(person)
  println(person.age)
  person.greet("Robyn")

  val austen =  new Writer("Jane", "Austen", 1775)
  println(austen.fullName)

  val senseAndSensibility = new Novel("Sense and Sensibility", 1811, austen)
  println(senseAndSensibility.authorAge())

  println(senseAndSensibility.isWrittenBy
  )


  val counter = new Counter
  println(counter.inc)
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
class Writer( val firstName: String = " ", val surname: String = " ", val birthYear: Int = 0){
  def fullName: String =
    s"$firstName $surname"
}

class Novel(name: String, yearOfRelease: Int, author: Writer){

  def authorAge(): Int = {
    yearOfRelease - author.birthYear
  }

  def isWrittenBy: String = {
    s"$name is written by ${author.fullName}"
  }

  def copy(newYear: Int): Novel = {
    val newNovel = new Novel(name, newYear, author)
    newNovel
  }
}

class Counter(val count: Int = 0) {
  def inc = new Counter(count + 1) //returning a new count because of immutability of objects. Instances are fixed so cannot
  //be modified inside. New instance must be made instead.
  def dec = new Counter(count -1)

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }

}