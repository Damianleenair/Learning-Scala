package VariablesAndStrings
@main
def variables(): Unit = {
  var tvShows = "many"    //This is a mutable variable - can be changed
  println(tvShows)
  tvShows = "too many"
  println(tvShows)

  val color1 = "Blue"   //This is an immutable variable - cannot be changed
  println(color1)
}
