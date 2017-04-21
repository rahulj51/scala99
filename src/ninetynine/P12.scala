package ninetynine

/**
  * Created by rahuljai on 4/21/17.
  */
object P12 {

  /*
  scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
   */


  def decode[A](l : List[(Int,A)]): List[A] = {
    l.flatMap(e => List.fill(e._1)(e._2))
  }

  def main(args: Array[String]): Unit = {
    println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  }


}
