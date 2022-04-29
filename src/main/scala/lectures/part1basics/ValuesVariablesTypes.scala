package lectures.part1basics

object ValuesVariablesTypes extends App {

  //VALS are IMMUTABLE
  val x: Int = 42 //declaring a value
  val y = 42 //type of val is optional as compiler can infer types
  println(x)


  val aString: String = "hello"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = 12
  val aShort: Short = 5467
  val aLong: Long = 6783685634876L //can mark with L at the end
  val aFloat: Float = 2.0F //denote with F
  val aDouble: Double = 3.14


  //VARS are MUTABLE
  var aVariable: Int = 4
  aVariable = 5 //side effects (changing a variable)
}
