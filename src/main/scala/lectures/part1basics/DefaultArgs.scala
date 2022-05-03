package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int = 1): Int =
    if(n <= 1) acc
    else trFact(n-1, n*acc)
//accumulator starts at one everytime
  //can specify default values in parameters so we don't have to enter it every time
  //can still pass in different value for accumulator when calling method, it overrides the 1


  //e.g. editing app
  def savePicture(format: String = "jpeg" , width: Int = 1920, height: Int = 1080): Unit = println("saving picture")

  savePicture("jpeg", 800, 600)
  //leading parameters with default values cannot be omitted as compiler gets confused
  //if all parameters have a default value then compiler will infer their values and it can be called with no input
  savePicture()

  /*solution to compiler errors:
  1. pass in every leading argument
  2. name the arguments
   */
  //e.g naming arguments
  savePicture(width = 2000)
  //naming arguments allows you to pass in values in a different order which can be useful too
  savePicture(height = 1800, format = "pdf", width = 2200)
}
