package ninetynine

/**
  * Created by rahuljai on 4/18/17.
  */
object P01 {

  def last[A](list: List[A]): A = list match {
    case (x::Nil) => list.head
    case (x::xs) => last(xs)
  }

}


object Main {

  def main(args: Array[String]): Unit = {

    println(P01.last(List(1)))
    println(P02.penultimate(List(1,2)))

  }
}
