package projecteuler.exercises

import projecteuler.Answer

object Ex005 extends Answer {
  def factorDict(n: Int): Map[Int, Int] = {
    def power(n: Int, a: Int): Int =
      // TODO; (0 to n) じゃなくて (0 to (もっと小さい値))にする
      (0 to n).filter(j => n % Math.round(Math.pow(a, j)) == 0).last

    def subFactorDict(n: Int, start: Int): Map[Int, Int] = {
      require (n >= 1)
      val pow = power(n, start)

      if (n == 1) { Map() }
      else if (n <= start) { Map(n -> pow) }
      else if (pow == 0) { subFactorDict(n, start + 1) }
      else {
        println(n, start)
        subFactorDict(n / Math.pow(start, pow).toInt, 2) + (start -> pow)
      }
    }
    subFactorDict(n, 2)
  }

  def result(maxN: Int): Int = {
    (1 to maxN)
      .map(factorDict(_))
      .foldLeft(Map[Int, Int]()) {(res, m) =>
        (
          for(a <- res.keySet ++ m.keySet) yield (a, res.getOrElse(a, 0).max(m.getOrElse(a, 0)))
        ).toMap
      }
      .foldLeft(1) {(res, t) =>
        res * Math.pow(t._1, t._2).toInt
      }
  }

  def run(): Any = {
    result(20)  // => 232792560
  }
}

