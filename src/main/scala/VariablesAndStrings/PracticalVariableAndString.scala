package VariablesAndStrings
//Exercise 1 : Print out My cats name is .....
//Exercise 2 : Print out two types of slashes \ and /
//Exercise 3: Print out www.google.com

@main

def variableExercise(): Unit = {
  val cat = "Garfield"
  println(s"My cats name is $cat")

  val cat1 = "My cat's name is \"Lion\""
  println(cat1)

  var slashes = " Two types of \\ and /"
  println(slashes)

  var url = "www.google.com"
  println(url)


}
