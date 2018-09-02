package projecteuler.exercises

import projecteuler.Answer

object Ex020 extends Answer {
  def factorial(n: Int): BigInt =
    (1 to n).map(j => BigInt(j)).product

  def sumOfDear(n: BigInt): Int
    = n.toString.toCharArray.map(_.asDigit).sum

  def result(n: Int): Int =
    sumOfDear(factorial(n))

  def run(): Any = {
    result(100) // 648
  }
}

