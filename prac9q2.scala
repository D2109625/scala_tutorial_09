object prac9q2 {
  def main(args: Array[String]): Unit = {
    val patternMatch: Int => String = {
      case x if x <= 0 => "Negative/Zero"
      case x if x % 2 == 0 => "Even"
      case x if x % 2 == 1 => "Odd"
    }

    import scala.io.StdIn

    println("Please enter an integer:")
    val input = StdIn.readLine()

    try {
      val inputNumber = input.toInt
      println(patternMatch(inputNumber))
    } catch {
      case _: NumberFormatException =>
        println("That's not a valid integer. Please try again.")
    }
  }
}

