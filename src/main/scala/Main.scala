package projecteuler
import projecteuler.exercises._

object ProjectEuler extends App {
  private val EXERCISES = Seq(
    Ex001,
    Ex002,
    Ex003,
    Ex004,
    Ex005,
    Ex006,
    Ex007,
    Ex008,
    Ex009,
    Ex010,
    Ex012,
    Ex013,
    Ex014,
    Ex015,
    Ex016,
    Ex018,
    Ex020,
    Ex021,
    Ex039,
    Ex040,
    Ex041,
    Ex042,
  )

  private def runAll() = {
    val start = System.currentTimeMillis
    EXERCISES.foreach(e => {
      runOne(e)
      println("=" * 80)
    })
    println("Total:" + (System.currentTimeMillis - start) / 1000.0 + " sec")
  }

  private def runOne(ans: Answer) = {
    val numberString =
      """Ex\d+""".r.findAllIn(ans.getClass.toString).matchData.toSeq.head.group(0)
    println("Problem: " + numberString)

    val start = System.currentTimeMillis
    println("Answer: " + ans.run.toString)
    println("Spend " + (System.currentTimeMillis - start) / 1000.0 + " sec")
  }

  runOne(Ex018)
}

