package UserInput

import scala.io.StdIn

@main
def estimatedAge(): Unit = {
  println("What is your birth year?")
  val birthYear = StdIn.readLine().toInt
  val approxAge = 2025-birthYear
  println(s"Your age is $approxAge")
}





