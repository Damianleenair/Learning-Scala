package NumbersAndVariables

@main
def numbersConversion(): Unit = {
  val cats = 3 //Int
  println(cats.getClass)
  val longCats = cats.toLong  // Conversion of cats to Long
  println(longCats.getClass)
}
