package lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String ={
    a + " " + b
  }
  println(aFunction("The number is", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n:Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1) //function calls itself so is recursive
  }

  //function does NOT NEED a return type, compiler can infer
  //BUT
  //Recursive function NEEDS a return type

  println(aRepeatedFunction("Hello", 3)) //WHEN YOU NEED LOOPS, USE RECURSIVE FUNCTIONS


  //EXERCISES

  //Greeting Function

  def greetingFunction(name: String, age: Int): String = {
    s"Hi my name is $name and I am $age years old!"
  }
  println(greetingFunction("connie", 22))

  //Factorial Function

  def factorialFunction(n: Int): Int = {
    if (n<=0) 1
    else factorialFunction(n-1)*n
  }
  println(factorialFunction(9))


  //Fibonacci Function
  def fibonacci(n: Int): Int =
    if(n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)



  //Prime Number Checker
  def primeNumberFunction(n: Int):Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else (n % t !=0 && isPrimeUntil(t-1))

    isPrimeUntil(n/2)
  }
  println(primeNumberFunction(5))
}
