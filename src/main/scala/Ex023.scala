package projecteuler.exercises

import projecteuler.Answer
import Math.{sqrt, round}
import org.apache.commons.io.FileUtils
import java.io.File

object Ex023 extends Answer {
  def isAbundantNumber(n: Int): Boolean =
    (1 until n).filter(n % _ == 0).sum > n

  def run(): Any = {
    val maxN = 28123
    val abundantNumbers = (1 until maxN).filter(j => isAbundantNumber(j)).toSeq
    val sumOfAbundantNumbers =
      (for(n <- abundantNumbers; m <- abundantNumbers if (n <= m && n + m <= maxN)) yield (n, m))
      .map(t => t._1 + t._2).distinct.toSeq
    maxN * (maxN + 1) / 2 - sumOfAbundantNumbers.sum  // 4179871
  }
}

