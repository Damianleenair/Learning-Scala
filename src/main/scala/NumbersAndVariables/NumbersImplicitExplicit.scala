package NumbersAndVariables
@main
def implicitExplicit(): Unit = {
  //Implicit
  val cats = 3
  println(cats.getClass)

  //Explicit
  val dogs: Byte = 5
  println(dogs.getClass)

  val days: Short = 30000
  println(days.getClass)

  val meals: Int = 3
  println(meals.getClass)

  val life: Long = 32 // Other option is 32L without :Long
  println(life.getClass)

  val money = 5.99 //Double
  println(money.getClass)

  val moreMoney = 6.99F // Float
  println(moreMoney.getClass)
}