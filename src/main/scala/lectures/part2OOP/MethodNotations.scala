package lectures.part2OOP

object MethodNotations extends App {

  class Person(name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    //    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception")) //prints true in console
  //OR
  println(mary likes "Inception") //infix or operator notation | only works on methods with one parameter


  //"OPERATORS"
  val tom = new Person("Tom", "Fight Club")

}

