package ninetynine

/**
  * Created by rahuljai on 5/25/17.
  *
  *P25 (*) Generate a random permutation of the elements of a list.
Hint: Use the solution of problem P23.
Example:

scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  */
object P25 {
  import P23.randomSelect
  def randomPermute[A](l: List[A]) : List[A] = randomSelect(l.length, l)

  def main(args: Array[String]): Unit = {
    println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))
  }

}
