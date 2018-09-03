package projecteuler.exercises

import org.scalatest.FunSpec

class Ex018Sepc extends FunSpec {
  private val exampleNumberMatrix = Seq(
    Seq(3),
    Seq(7, 4),
    Seq(2, 4, 6),
    Seq(8, 5, 9, 3),
  )

  describe ("resultTest") {
    it ("sample") {
      assert(Ex018.result(exampleNumberMatrix) == 23)
    }
  }
}

