package projecteuler.exercises

import org.scalatest.FunSpec

class Ex040Sepc extends FunSpec {
  describe ("splitNumber") {
    assert(Ex040.splitNumber(362) == Seq(3, 6, 2))
  }
}

