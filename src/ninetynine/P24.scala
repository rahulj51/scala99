package ninetynine

/**
  * Created by rahuljai on 5/24/17.
  *
  *P24 (*) Lotto: Draw N different random numbers from the set 1..M.
*Example:
*scala> lotto(6, 49)
*res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  */

object P24 {
  import P23.randomSelect
  def lotto(c: Int, m: Int): List[Int] =
    randomSelect(c, List.range(1, m + 1))

  def main(args: Array[String]): Unit = {
    println(lotto(6,49))
  }
}
