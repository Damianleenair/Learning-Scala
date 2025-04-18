package VariablesAndStrings
@main
def stringFunctions(): Unit = {
  //length used to get the length of a string
  val myPet = "Crocodile"
  myPet.length // 9
  println(myPet.length)

  //string with capital letter
  val myName = "damian"
  println(myName.capitalize)

  //Lowercase a string
  val myAnimal = "Giraffe"
  println(myAnimal.toLowerCase)

  //Uppercase a string
  val myAnimal1 = "Dog"
  println(myAnimal1.toUpperCase)

  //Trim a string
  val myText = "      there are too many spaces          "
  println(myText.trim)

  //Get a character - Position always starts at 0
  println(myPet(3)) // c

  //Another method to get a character
  println(myPet.charAt(3)) // c

  //Get part of a string
  println(myPet.substring(3)) //codile

  //Substring with start and finish
  println(myPet.substring(3,7))//codi
  
  /*
  How do we find all string functions?
  We type in the variable for example
  myText. and a list of string functions will appear
   */

}
