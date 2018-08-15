package projecteuler.exercises

import projecteuler.Answer

object Ex007 extends Answer {
  def eratosthenesSieve(n: Int) = {
    def addPrime(j: Int, primeSeq: Seq[Int]): Seq[Int] =
      if (primeSeq.exists(j % _ == 0)) primeSeq else primeSeq :+ j
    var primeSeq = Seq[Int]()
    var j = 2
    while (primeSeq.size < n) {
      primeSeq = addPrime(j, primeSeq)
      j += 1
    }
    primeSeq.last
  }


  def result(n: Int): Int =
    eratosthenesSieve(n)

  def run(): Any = {
    result(10001) // => 104743
  }
}

