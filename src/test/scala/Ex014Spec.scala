package projecteuler.exercises

import org.scalatest.FunSpec

class Ex014Sepc extends FunSpec {
  it ("resultTest") {
    assert(Ex014.collatzLen(13) == 10)
  }
  it ("resultTest2") {
    assert(Ex014.collatzLen(1) == 1)
  }
}

