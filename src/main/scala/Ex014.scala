package projecteuler.exercises

import projecteuler.Answer

object Ex014 extends Answer {
  def collatzLen(n: Int): Int = {
    var num = BigInt(n)
    var j = 1
    while (true) {
      if (num == 1) return j
      else {
        j += 1
        if (num % 2 == 0) num = num / 2
        else num = 3 * num + 1
      }
    }
    return -1
  }

  def result(n: Int) = (1 until n)
    .map(j => (j, collatzLen(j)))
    .maxBy(_._2)

  def run(): Any = {
    result(1000000)._1 // 837799
  }
}

