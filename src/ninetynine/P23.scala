package ninetynine

/**
  * Created by rahuljai on 5/18/17.
  * P23 (**) Extract a given number of randomly selected elements from a list.
Example:
scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
res0: List[Symbol] = List('e, 'd, 'a)
Hint: Use the solution to problem P20
  */
object P23 {

  def randomSelect[A](k: Int, l : List[A]) : List[A] = {

    def loop[A](n:Int, ls: List[A]):List[A] = {
      if (n > 0) {
        val (rest, e) = P20.removeAt(scala.util.Random.nextInt(ls.length),ls)
        e :: loop(n-1, rest)
      } else {
        Nil
      }
    }

    loop(k, l)
  }

  def main(args: Array[String]): Unit = {
    println(randomSelect(3, List('a,'b,'c,'d,'f,'g, 'h)))
  }

}
