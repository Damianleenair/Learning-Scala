package NumbersAndVariables

import scala.io.StdIn

@main

def challengeDataTypes(): Unit = {
  println("Please enter a number of double type:")
  val doubleNum= StdIn.readLine().toDouble
  var pi = 3.14159
  val multipliedNum = pi*doubleNum
  println(multipliedNum.getClass)
  println(multipliedNum)


}
