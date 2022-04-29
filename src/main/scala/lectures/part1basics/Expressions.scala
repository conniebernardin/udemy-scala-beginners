package lectures.part1basics

object Expressions extends App {

  val x = 1+2 //EXPRESSION
  println(x)

  //Relational operation
  println(1 == x) //returns boolean

  var aVariable = 2
  aVariable += 3 //returns 5 | also works with -= *= /=

  //Instructions vs Expressions
  //Instruction | something you tell computer to DO
  //Expression | has a value and/or a type

  //If Expression
  //gives back a value
  val aCondition = true
  val aConditionValue = if(aCondition) 5  else 3
  println(aConditionValue)

  //discourage using loops in scala
  //dont execute anything meaningful, only return side effects

  //Everything in Scala is an expression

  val aWeirdValue = (aVariable = 3) //unit returns void
  //side effects are expressions returning unit
  //e.g printing, whiles reassigning


  //Code Blocks
  //it is an expression
  //value of block is value of last expression
  val aCodeblock = {
    val y = 2
    val z = y-1

    if (z>2) "big" else "small"
  }
}
