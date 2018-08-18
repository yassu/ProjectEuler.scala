package projecteuler.exercises

import projecteuler.Answer

object Ex039 extends Answer {
  def gcd(a: Int, b: Int): Int = if(b ==0) a else gcd(b, a%b)
  def relativelyPrime(a: Int, b: Int): Boolean = gcd(a, b) == 1

  def result(pMax: Int) =
    (
    for (
      v <- (1 to ((Math.sqrt(pMax) / 2)).toInt);
      u <- (v + 1 to pMax / 2).by(2) if relativelyPrime(u, v);
      g <- (1 to pMax / (2 * u * (u + v))))
        yield (g * (u * u - v * v), 2 * g * u * v, g * (u * u + v * v))
    )
    .filter(t => t._1 + t._2 + t._3 <= pMax)
    .groupBy(t => t._1 + t._2 + t._3)
    .maxBy(e => e._2.size)

  def run(): Any = {
    result(1000)._1 // => 840
  }
}

