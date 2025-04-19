package UserInput
//The StdIn package is imported to read input from the user
import scala.io.StdIn

@main
def userInput(): Unit = {
  println("Type something: ")
  val input = StdIn.readLine()
  println(input)

  val number = input.toInt
  println(number * 2)
}

