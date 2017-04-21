package ninetynine

/**
  * Created by rahuljai on 4/21/17.
  */
object P13 {

  /*
  scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

   */

  def encodeDirect[A](l:List[A]): List[(Int,A)] = {
    if (l.isEmpty) Nil  else {
      val (sub, rest) = l.span(x => x == l.head)
      (sub.length, sub.head) :: encodeDirect(rest)
    }

  }

  def main(args: Array[String]): Unit = {
    println(P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}
