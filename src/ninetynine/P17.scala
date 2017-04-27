package ninetynine

/**
  * Created by rahuljai on 4/21/17.
  */
object P17 {
  /*
  scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
   */


  def split[A](n:Int, l : List[A]): (List[A], List[A]) = {
    (l.take(n), l.drop(n))
  }

  def main(args: Array[String]): Unit = {
    println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
