package projecteuler.exercises

import projecteuler.Answer

object Ex010 extends Answer {
  def eratosthenesSieve(n: Int) = {
    def addPrime(j: Int, primeSeq: Seq[Int]): Seq[Int] =
      if (primeSeq.exists(j % _ == 0)) primeSeq else primeSeq :+ j
    var primeSeq = Seq[Int]()
    var j = 2
    while (j < n) {
      primeSeq = addPrime(j, primeSeq)
      j += 1
    }
    primeSeq
  }


  def result(n: Int) =
    eratosthenesSieve(n).map(n => BigInt(n)).sum

  def run(): Any = {
    result(2000000) //
  }
}

