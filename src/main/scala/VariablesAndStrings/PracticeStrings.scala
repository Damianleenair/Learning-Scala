package VariablesAndStrings
@main

def practiceStrings(): Unit = {
  //Print out the length of the variable catName
  val catName = "My cat's name is \"Fluffy\""
  println(catName.length)
  //Extract and print out car from the variable myCar
  val myCar = "My car won't start"
  println(myCar.substring(3,6))
  //Given the name of a customer in a variable, print a personalised message for that customer to the console
  val clientName = "Bruno"
  println(s"Hello $clientName, thank you for shopping at Shoprite!")

  //Given two variable numbers. Print to the console the amount of fruit available
  val apples = 3
  val oranges = 6
  println(s"The number of fruit available is :${apples+oranges}")
}
