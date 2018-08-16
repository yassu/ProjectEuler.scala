package projecteuler.exercises

import projecteuler.Answer
import Math.sqrt

object Ex009 extends Answer {

  def run(): Any = {
    val n = 1000
    val (a, b, c) = {
      (for (a <- (1 until n); b <- (1 until n)) yield (a, b))
        .filter(t => t._1 < t._2)
        .map(t => (t._1, t._2, n - (t._1 + t._2)))
        .filter(t => t._1 * t._1 + t._2 * t._2 == t._3 * t._3)
        .head
    }
    a * b * c // -> 31875000
  }
}

