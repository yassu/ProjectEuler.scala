package projecteuler.exercises

import projecteuler.Answer

object Ex012 extends Answer {
  val triangularStream = {
    def getTriangularStream(n: Int): Stream[Int] =
      Stream.cons(n * (n + 1) / 2, getTriangularStream(n + 1))
    getTriangularStream(1)
  }

  def divisors(n: Int): Seq[Int] =
    (1 to n / 2).filter(n % _ == 0).toSeq :+ n

  def result(n: Int) = triangularStream.dropWhile(divisors(_).size <= n).head

  def run(): Any = {
    result(500) // 76576500 (1912 s)
  }
}

