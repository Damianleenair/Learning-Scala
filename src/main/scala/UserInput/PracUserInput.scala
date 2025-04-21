package UserInput

import scala.io.StdIn

@main
def pracUserInput(): Unit = {

  //Ask a user for their name and print their name with a personalized message
  println("What is your name?")
  val input = StdIn.readLine()
  println(s"Welcome to XYZ Stores, $input")

  //Write a prog that asks the user for a number and prints out that number multiplied by 5
  println("Please enter a number:")
  //Note: Don't forget to convert this value to an Integer
  val number=StdIn.readLine().toInt
  println(s"Your number multiplied by 5 is ${number * 5}")
}
