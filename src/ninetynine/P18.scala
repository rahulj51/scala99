package ninetynine

/**
  * Created by rahuljai on 4/27/17.
  * Extract a slice from a list.
Given two indices, I and K, the slice is the list containing the elements
from and including the Ith element up to but not including the Kth element of the original list.
Start counting the elements with 0.
Example:

scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)

  */
object P18 {

  def slice[A](i:Int, k: Int, l: List[A]):List[A] = {

    l.drop(i).take(k-i)

  }

  def slice_recursive[A](i:Int, k: Int, l: List[A]):List[A] = {
    def skip(ll: List[(A,Int)]):List[(A,Int)] = {
      if (ll.head._2+1 <= i) skip(ll.tail) else ll
    }

      skip(l.zipWithIndex).foldRight(List[A]())((e, z) => if (e._2 < k) e._1 :: z else z)

  }

  def main(args: Array[String]): Unit = {
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    println(slice_recursive(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}
