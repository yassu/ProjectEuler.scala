package projecteuler.exercises

import projecteuler.Answer

object Ex015 extends Answer {
  val resultCache = collection.mutable.Map[(Int, Int), Int]()

  def result(width: Int, height: Int): Int = {
    if (width == 1) height + 1
    else if (height == 1) width + 1
    else if (resultCache.isDefinedAt((width, height)))
      resultCache((width, height))
    else {
      val res = result(width - 1, height) + result(width, height - 1)
      resultCache((width, height)) = res
      res
    }
  }

  def run(): Any = {
    result(20, 20)
  }
}

