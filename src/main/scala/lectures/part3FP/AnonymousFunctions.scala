package lectures.part3FP

object AnonymousFunctions extends App {

  //anonymous function [LAMBDA]
  val doubler: Int => Int = (x: Int) => x*2

  val adder: (Int, Int) => Int = (a: Int, b:Int) => a+b

  //Using curly brackets with Lambdas

  val strintToInt = { (s: String) =>
    s.toInt
  }
  val niceAdder: (Int, Int) => Int = _+_

  val superAdd = (x: Int) => (y: Int) => x+y
  println(superAdd(3) (4)) //curried

}
