package ninetynine

/**
  * Created by rahuljai on 4/21/17.
  */
object P15 {

  //duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  def duplicateN[A](n:Int, l : List[A]): List[A] = {
    l.flatMap(x => List.fill(n)(x))
  }

  def main(args: Array[String]): Unit = {
    println(duplicateN(3, List('a,'b, 'c, 'c, 'd)))
  }
}
