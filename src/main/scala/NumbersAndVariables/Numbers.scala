package NumbersAndVariables
@main
def numbers(): Unit = {
//  val price = 36
//  val items = 2
//  val totalPrice = price * items
//  println(totalPrice)
  val items = 5 //Integer
  println(items.getClass)// Printing out the type of the variable

  val account = 2_000_000 //Integer
  println(account.getClass)

  val noOfPeople = 80000000000000000L // This number will give you an error so we will add L to end of number for Long
  println(noOfPeople.getClass)

  val price = 39.99F //Double originally but if we wanted to change it to Float we add F to the end of number
  println(price.getClass)

  val pi=3.14159
  println(pi.getClass)
}
