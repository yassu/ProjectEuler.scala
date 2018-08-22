package projecteuler.exercises

import Math._
import projecteuler.Answer

object Ex003 extends Answer {
  // https://issues.scala-lang.org/browse/SI-3739
  def sqrt(number:BigInt):BigInt = {
    def next(n: BigInt, i: BigInt): BigInt = (n + i / n) >> 1
    val one = BigInt(1)
    val n = one
    val n1 = next(n, number)
    def sqrtHelper(n: BigInt, n1: BigInt): BigInt =
      if ((n1 - n).abs <= one) { List(n1,n).max }
      else { sqrtHelper(n1, next(n1, number)) }
    sqrtHelper(n, n1)
  }

  def factor(n: BigInt): List[BigInt] = {
    val dividedNumbers = (2 until this.sqrt(n).toInt).filter(n % _ == 0)
    if (n < 2) { List() }
    else if (dividedNumbers.isEmpty) { List(n) }
    else {
      val minFac = dividedNumbers.head
      minFac :: factor(n / minFac)
    }
  }

  def run(): Any = {
    factor(BigInt("600851475143")).last // => 6857
  }
}

