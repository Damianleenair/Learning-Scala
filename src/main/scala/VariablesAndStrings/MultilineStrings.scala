package VariablesAndStrings
@main

def multilineStrings(): Unit = {
  //Example of a multiline string using \n
  val str1 = "This is a \nmultiline \nstring"
  println(str1)

  //Example of a multiline string using the """ operator

  val str2=
  """
  This is a
  multiline
  string
  """
  println(str2)

  //Example using stripMargin
  val str3 =
    """
      |This is a
      |multiline
      |string
      |""".stripMargin

 println(str3)
}
