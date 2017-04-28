package ninetynine

/**
  * Created by rahuljai on 4/28/17.
  * scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
    res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */
object P21 {

  def insertAt[A](e:A, k: Int, l:List[A]):List[A] = l.splitAt(k) match {
    case (pre, post) => pre ::: (e :: post)
  }

  def main(args: Array[String]): Unit = {
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
    println(insertAt('new, 0, List('a, 'b, 'c, 'd)))
    println(insertAt('new, -5, List('a, 'b, 'c, 'd)))
    println(insertAt('new, 25, List('a, 'b, 'c, 'd)))
  }

}
