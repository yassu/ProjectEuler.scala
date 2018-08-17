package projecteuler.exercises

import projecteuler.Answer
import Math.{sqrt, round}
import org.apache.commons.io.FileUtils
import java.io.File

object Ex042 extends Answer {
  val FILENAME = new File("assets/p042_words.txt")
  val ALPHABET_DICT = Map(
    'A' -> 1,
    'B' -> 2,
    'C' -> 3,
    'D' -> 4,
    'E' -> 5,
    'F' -> 6,
    'G' -> 7,
    'H' -> 8,
    'I' -> 9,
    'J' -> 10,
    'K' -> 11,
    'L' -> 12,
    'M' -> 13,
    'N' -> 14,
    'O' -> 15,
    'P' -> 16,
    'Q' -> 17,
    'R' -> 18,
    'S' -> 19,
    'T' -> 20,
    'U' -> 21,
    'V' -> 22,
    'W' -> 23,
    'X' -> 24,
    'Y' -> 25,
    'Z' -> 26,
  )

  def isSquareNumber(n: Int): Boolean = {
    val l = Math.round(Math.sqrt(n))
    l * l == n
  }

  def isTriangularNumber(n: Int): Boolean =
    isSquareNumber(1 +8 * n)

  def run(): Any = {
    val words = FileUtils.readFileToString(FILENAME, "UTF-8")
      .split(",")
      .map(w => w.slice(1, w.size - 1))   // ダブルクォーテーションの削除

    words
      .map(w => w.map(c => ALPHABET_DICT(c)).sum)
      .filter(isTriangularNumber)
      .size // -> 162
  }
}

