package projecteuler.exercises

import projecteuler.Answer

object Ex004 extends Answer {
  def isPalindrome(n: Int): Boolean = {
    val s = n.toString
    s.reverse == s
  }

  def product(l1: List[Int], l2: List[Int]): List[(Int, Int)] =
    (for(x <- l1; y <- l2) yield (x, y)).toList

  // a > 0 かつ b >= 0を仮定する
  def powInt(a: Int, b: Int): Int =
    if (b == 0) 1
    else a * powInt(a, b - 1)

  def result(digit: Int): Int = {
    val numbers = (powInt(10, digit - 1) until powInt(10, digit)).toList
    product(numbers, numbers)
      .map(t => t._1 * t._2)
      .filter(isPalindrome(_))
      .max
  }


  def run(): Any = {
    result(3)
  }
}

