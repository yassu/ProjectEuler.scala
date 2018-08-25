package projecteuler.exercises

import projecteuler.Answer

object Ex015 extends Answer {
  def factorial(n: Int): BigInt =
    (1 to n).map(j => BigInt(j)).product

  def result(n: Int): BigInt =
    factorial(2 * n) / (factorial(n) * factorial(n))

  def run(): Any = {
    result(20) // 137846528820
  }
}

