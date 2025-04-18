package VariablesAndStrings

@main
def stringInterpolation(): Unit = {
  val myDog = "Brutus"
  println(s"My dog's name is $myDog") // s interpolator
  println(s"I have ${1+1} cats") // s interpolator with expression

  println(raw"This is a \n new \\line") //raw interpolator
}

