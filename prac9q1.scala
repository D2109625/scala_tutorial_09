object InterestCalculator {
    val calculateInterest: Double => Double = depositAmount => 
    depositAmount match {
      case x if x <= 20000 => x * 0.02
      case x if x <= 200000 => x * 0.04
      case x if x <= 2000000 => x * 0.035
      case _ => depositAmount * 0.065
    }
    

  @main def prac9q1(): Unit = {
    val deposit1 = 15000.0
    val deposit2 = 50000.0
    val deposit3 = 540000.0
    val deposit4 = 2800000.0

    println(s"Interest on Rs. $deposit1: Rs. ${calculateInterest(deposit1)}")
    println(s"Interest on Rs. $deposit2: Rs. ${calculateInterest(deposit2)}")
    println(s"Interest on Rs. $deposit3: Rs. ${calculateInterest(deposit3)}")
    println(s"Interest on Rs. $deposit4: Rs. ${calculateInterest(deposit4)}")
  }
}

