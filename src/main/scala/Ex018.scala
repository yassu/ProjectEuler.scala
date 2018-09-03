package projecteuler.exercises

import projecteuler.Answer

object Ex018 extends Answer {
  private val NUMBER_MATRIX = Seq(
    Seq(75),
    Seq(95, 64),
    Seq(17, 47, 82),
    Seq(18, 35, 87, 10),
    Seq(20, 4, 82, 47, 65),
    Seq(19, 1, 23, 75, 3, 34),
    Seq(88, 2, 77, 73, 7, 63, 67),
    Seq(99, 65, 4, 28, 6, 16, 70, 92),
    Seq(41, 41, 26, 56, 83, 40, 80, 70, 33),
    Seq(41, 48, 72, 33, 47, 32, 37, 16, 94, 29),
    Seq(53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14),
    Seq(70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57),
    Seq(91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48),
    Seq(63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31),
    Seq(4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23)
  )

  def getMaxNumber(numberMatrix: Seq[Seq[Int]]): Int = {
    def getMaxNumber(startX: Int, startY: Int): Int =
      if (startY == numberMatrix.size - 1) numberMatrix(startY)(startX)
      else
        numberMatrix(startY)(startX) +
          getMaxNumber(startX, startY + 1).max(getMaxNumber(startX + 1, startY + 1))

    getMaxNumber(0, 0)
  }

  def result(numberMatrix: Seq[Seq[Int]]): Int = {
    getMaxNumber(numberMatrix)
  }

  def run(): Any = {
    result(NUMBER_MATRIX) // 1074
  }
}

