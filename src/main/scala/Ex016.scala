package projecteuler.exercises

import projecteuler.Answer

object Ex016 extends Answer {
  def result(pow: Int): Int = {
    val number = List.fill(pow)(BigInt(2)).product
    number.toString.map(_.asDigit).sum
  }

  def run(): Any = {
    result(1000)  // => 1366
  }
}

