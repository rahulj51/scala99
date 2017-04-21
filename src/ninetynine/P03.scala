package ninetynine

/**
  * Created by rahuljai on 4/18/17.
  */
object P03 {

  def kth[A](k: Int, l:List[A]):A = {
    if (l.isEmpty) return null.asInstanceOf[A]
    if (k==0) l.head else kth(k-1,l.tail)
  }

  def main(args: Array[String]): Unit = {

    println(P03.kth(20, List(1,2,3,4,5,6,7)))
  }

}
