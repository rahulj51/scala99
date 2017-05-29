package ninetynine

/**
  * Created by rahuljai on 5/27/17.
  */
object P27 {

  /*
  scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
res0: List[List[List[String]]] = List(
       List(
          List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)
          ), ...
   */

  import P26.combinations

  //  def group[A](m:Int, l: List[A]): List[List[List[A]]] = (m, l) match {
  //    case (x,_) if x == 1 => return List(List(List[A]()))
  //    case (_, Nil) => return List(List(List[A]()))
  //    case _ => combinations(m,l).map(x => x :: combinations(m-1,  l filterNot (x contains)))
  //  }
  //
  //  def group3[A](l: List[A]): List[List[List[A]]] = group(4, l)

  //copied from solutions. Unable to solve.
  def group3[A](ls: List[A]): List[List[List[A]]] =
    for {
      a <- combinations(2, ls)
      noA = ls filterNot (a contains)
      b <- combinations(3, noA)
    } yield List(a, b, noA filterNot (b contains))


  def main(args: Array[String]): Unit = {
    println(group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))
  }

}
