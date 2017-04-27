package ninetynine

/**
  * Created by rahuljai on 4/21/17.
  */
object P16 {

  /*
  scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
   */

  def drop[A](n: Int, l : List[A]): List[A] = {

    //l.zipWithIndex.foldLeft(List()) ((acc:List[A], e) => if (e._2 % n != 0) (e._1 :: acc) else acc)
    l.zipWithIndex.filter(x => (x._2 + 1) % n != 0).map(x => x._1)

  }

  def main(args: Array[String]): Unit = {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
