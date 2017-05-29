package ninetynine

/**
  * Created by rahuljai on 5/25/17.
  * scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...

  */
object P26 {

  /*
  Thoughts:
  can be solved by recursion
  think of the smallest case a single element -> should return a single element
  2 elements will be
      loop through the 2 elements, for each element, find combinations of the remaining

   */


//  def combinations[A](n:Int, l: List[A]) : List[List[A]] = {
//
//    //abcd -> 3 => abc, abd, bcd
//    def single_combination[A](k:Int, ls:List[A]): List[A] = {
//      if (k == 0) return Nil
//      if (ls.isEmpty) return Nil
//      ls.head :: single_combination(k-1, ls.tail)
//    }
//
//    println(single_combination(n, l))
//    return Nil
//  }

  /*
     Couldn't solve it myself so copied solution from https://rosettacode.org/wiki/Combinations#Scala
   */

  def combinations[A](n:Int, l: List[A]) : List[List[A]] = (n, l) match {
    case (0, xs) => List(Nil)
    case (_, Nil) => Nil
    case _ => (combinations(n - 1, l.tail) map (l.head :: _)) ::: combinations(n, l.tail)
  }


  def main(args: Array[String]): Unit = {
    println(combinations(3, List('a,'b,'c,'d,'e,'f)))
  }

}
