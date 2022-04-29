package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def factorialFunction(n: Int): Int = {
    if (n<=0) 1
    else factorialFunction(n-1)*n
  }
//StackOverFlowError happen when recursive depth is too big
  // JVM cannot call recursive function too many times without crashing

  def anotherFactorial(n: Int): BigInt = {
    @tailrec //tells compiler that this method is meant to be recursive
    def factHelper(x: Int, accumulator: BigInt): BigInt = //accumulators need same return type as function
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = when recursive call is the the LAST expression used by method

    factHelper(n, 1)
  }

  //WHEN  YOU NEED LOOPS, USE TAIL RECURSION

  //BENEFITS
  /*
  * Tail Recursion optimise recursive code with help of a stack
  * stack stores all relevant information of each recursion
  * */

}
