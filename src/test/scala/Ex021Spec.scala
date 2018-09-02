package projecteuler.exercises

import org.scalatest.FunSpec

class Ex021Sepc extends FunSpec {
  describe ("resultTest") {
    it ("sample") {
      assert(! Ex021.result(1))
      assert(! Ex021.result(2))
      assert(! Ex021.result(3))
      assert(Ex021.result(220))
    }
  }
}

