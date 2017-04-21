package ninetynine

/**
  * Created by rahuljai on 4/20/17.
  */
object P09 {

  //pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  def pack[A](l: List[A]): List[List[A]] = {
    if (l == Nil) return List(List())
    val (sub, rem) = l.span(x => x == l.head)
    if (rem == Nil) List(sub) else sub :: pack(rem)
  }

  def main(args: Array[String]): Unit = {
    println(P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}
