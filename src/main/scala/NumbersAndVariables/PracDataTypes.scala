package NumbersAndVariables

import scala.io.StdIn

@main
// Ask a user for a number and read the input then convert it to the different data types
def pracDataTypes(): Unit = {
  println("Please enter a number :")
  val number = StdIn.readLine()
  println(number.toByte)
  println(number.toShort)
  println(number.toInt)
  println(number.toLong)
  println(number.toFloat)
  println(number.toDouble)
/*You have the variable pi = 4.14159
What is the type?
Convert it to a float. What is the value? Print it
Convert it to an int. What is the value? Print it
Convert it to a string. What is the value? Print it
 */

  var pi = 3.14159
  println(pi.getClass)

  var piFloat = pi.toFloat
  println(piFloat)

  var piInt = pi.toInt
  println(piInt)

  var piString = pi.toString
  println(piString)
}
