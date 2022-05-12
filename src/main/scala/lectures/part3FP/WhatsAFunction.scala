package lectures.part3FP

object WhatsAFunction extends App {

  //use and work with functions as first class elements


  /*define a function which takes 2 strings and concatenates then */

  def concatenate(first: String, second:String):String = first + " " + second
  def whatsYourName(first: String, second:String):String = s"My name is $first $second"
  println(concatenate("Jorge", "Regula"))
  println(whatsYourName("Connie", "Bernardin"))

  }
