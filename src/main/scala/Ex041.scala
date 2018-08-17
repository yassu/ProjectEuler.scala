package projecteuler.exercises

import projecteuler.Answer
import Math.{sqrt, round}
import org.apache.commons.io.FileUtils
import java.io.File

object Ex041 extends Answer {
  def isPrime(n: Int): Boolean =
    n > 1 && ! (2 until n).exists(n % _ == 0)

  def connectNumber(l: IndexedSeq[Int]): Int =
    if (l.size == 1) l(0) else 10 * connectNumber(l.dropRight(1)) + l.last

  def run(): Any = {
    val seq = (1 to 7).permutations.filter(l =>
      l.last % 2 != 0 &&
      l.last % 5 != 0 &&
      isPrime(connectNumber(l))).toSeq.last
    connectNumber(seq)  // 7652413
  }
}

