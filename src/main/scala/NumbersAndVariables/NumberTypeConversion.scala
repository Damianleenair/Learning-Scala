package NumbersAndVariables

@main
def numbersConversion(): Unit = {
  val cats = 3 //Int
  println(cats.getClass)
  val longCats = cats.toLong  // Conversion of cats to Long
  println(longCats.getClass)

  // Converting a larger type to a smaller type may lead to data loss
  val people = 8_000_000_000L
  val fewPeople = people.toInt
  println(fewPeople)
}
