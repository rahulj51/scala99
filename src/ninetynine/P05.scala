package ninetynine

/**
  * Created by rahuljai on 4/20/17.
  */
object P05 {

  def reverse[A](l: List[A]): List[A] = {
    l.foldLeft(List[A]())((acc,e) => e :: acc)

  }

  def main(args: Array[String]): Unit = {
    println(P05.reverse(List(1,2,3,4,5)))
  }

}
