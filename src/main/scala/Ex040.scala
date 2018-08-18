package projecteuler.exercises

import projecteuler.Answer

object Ex040 extends Answer {
  def splitNumber(n: Int): Seq[Int] =
    if (n < 0) Seq() else if (n < 10) Seq(n) else splitNumber(n / 10) :+ (n % 10)

  def champernowneConstantSeq(size: Int): Seq[Int] =
    (1 to size).map(n => splitNumber(n)).flatMap { x => x }

  def run(): Any = {
    val seq = champernowneConstantSeq(1000000)
    seq(1 - 1) * seq(10 - 1) * seq(100 - 1) * seq(1000 - 1) *
      seq(10000 - 1) * seq(100000 - 1) * seq(1000000 - 1) // 210
  }
}

