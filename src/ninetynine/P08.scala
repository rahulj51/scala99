package ninetynine

/**
  * Created by rahuljai on 4/20/17.
  */
object P08 {

  //compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

  def compress[A](l:List[A]):List[A] = l match {
    case Nil => Nil
    case (x::xs) => x :: compress(l.dropWhile(_ == x))
  }

  def compress2[A](l:List[A]):List[A] = { //using span
    if (l == Nil) return Nil
    val (sub, rest) = l.span( x => x == l.head)
    sub.head :: compress2(rest)
  }

  def main(args: Array[String]): Unit = {
//    println(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println(P08.compress2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}
