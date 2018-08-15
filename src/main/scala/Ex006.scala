package projecteuler.exercises

import projecteuler.Answer

object Ex006 extends Answer {
  def result(maxN: Int): Int =
    maxN * maxN * (maxN + 1) * (maxN + 1) / 4 - maxN * (maxN + 1) * (2 * maxN + 1) / 6

  def run(): Any = {
    result(100)  // => 25164150
  }
}

