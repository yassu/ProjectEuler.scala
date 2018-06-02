package projecteuler.exercises
import projecteuler.Answer
import math.{ceil, log, round}

object Ex002 extends Answer {
  def fib(n: Int): Int =
    if(n <= 1) n else fib(n - 1) + fib(n - 2)

  def run(): Any = {
    val maxN = 4 * 1000000
    val maxIndex = round(ceil(log(maxN) / log(1.5))).toInt
    (1 to maxIndex).
      map(fib).
      takeWhile(_ < maxN).
      filter(_ % 2 == 0).sum // 4613732
  }
}

