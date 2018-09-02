package projecteuler.exercises

import projecteuler.Answer

object Ex021 extends Answer {
  def sumOfDivisor(n: Int): Int =
    (1 until n).filter(n % _ == 0).sum

  def isAmicableNumber(n: Int): Boolean = {
    val m = sumOfDivisor(n)
    (n != m) && (sumOfDivisor(m) == n)
  }

  def result(n: Int): Boolean =
    isAmicableNumber(n)

  def run(): Any = {
    (2 until 10000).filter(n => isAmicableNumber(n)).sum // 31626
  }
}

