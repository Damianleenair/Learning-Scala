package NumbersAndVariables

import scala.io.StdIn

@main
/* Challenge: Ask the user to input a number and read it into a variable
Convert it into an int
Multiply that value with a double variable that you created
what is the type of the new variable?
Print it to the console
 */
def challengeNumbers(): Unit = {
  println("Please input a number: ")
  val inputNumber = StdIn.readLine().toInt
  val newNumber = inputNumber*29.99
  println(newNumber)
  println(newNumber.getClass)
}