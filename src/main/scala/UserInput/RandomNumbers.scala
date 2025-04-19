package UserInput

import scala.util.Random

@main

def randomNumbers(): Unit = {
  println(Random.nextInt())

  //Providing our random number with a maximum limit
  println(Random.nextInt(50))
}
