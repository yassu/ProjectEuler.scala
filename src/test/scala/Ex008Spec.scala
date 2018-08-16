package projecteuler.exercises

import org.scalatest.FunSpec

class Ex008Sepc extends FunSpec {
  describe ("multipleString") {
    assert(Ex008.multipleString("23789") == 2 * 3 * 7 * 8 * 9)
  }
}

