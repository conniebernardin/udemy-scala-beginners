package lectures.part1basics

object StringOps extends App{

  val str: String = "Hello, I am learning Scala"

  //string operations
  //scala runs on Java Virtual Machine so has access to string class in java and its functions
  println(str.charAt(2)) //returns character at index 2
  println(str.substring(7, 11)) //substring from index 7 to 11
  println(str.split(" ").toList) //splits string by spaces, then compiles results into list
  println(str.startsWith("Hello")) //returns true or false if string starts with hello
  println(str.replace(" ", "-")) //replace spaces with hyphens
  println(str.length) //prints how long the string is
  println(str.toUpperCase())

  //scala has its own utilities as well as java functions
  val aNumberString = "45"
  val aNumber = aNumberString.toInt //converts string to int
  println('a' +: aNumberString) //prepending to a string , adds a to start of string
  println(aNumberString :+ 'z') //appending to a string , adds z to end of string
  println(str.reverse) //reverses string
  println(str.take(3)) //takes/returns 3 characters from the string

  //Scala Specific: String Interpolator

  //S-Interpolator
  val name = "connie"
  val age = 22
  val greeting = s"Hello, my name is $name and i am $age years old"
  println(greeting)
  //can handle more complex inputs
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1}"
  println(anotherGreeting)

  //F-interpolator
  //formatted strings
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute" //2.2 stands for 2 characters and 2 decimals

  
  //raw-interpolator



}
