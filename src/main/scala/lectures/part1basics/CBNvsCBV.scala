package lectures.part1basics

object CBNvsCBV extends App{

//long value type is usually used for time in nanoseconds
  def calledByValue(x: Long): Unit ={
    println("by value: " + x)
    println("by value: " + x)
  }
  //exact value of the expression is computed before the function evaluates, then the same value is used in the function
  //definition

  //arrow tells you that the function will be called by name
  def calledByName(x: => Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }
  //expression is called as is, and is evaluated every time
  //useful in lazy streams and things that might fail
  
  calledByValue(System.nanoTime()) //two identical values
  calledByName(System.nanoTime()) //two different values

//demonstrating by name function
  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

}
