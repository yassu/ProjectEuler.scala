package projecteuler.exercises
import projecteuler.Answer

object Ex001 extends Answer {
  def sumUntil(n: Int, div1: Int, div2: Int) =
    (1 until n).filter(k => k % div1 == 0 || k % div2 == 0).sum

  def run(): Any = {
    sumUntil(1000, 3, 5)
  }
}
