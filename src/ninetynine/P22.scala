package ninetynine

/**
  * Created by rahuljai on 5/2/17.
  */
object P22 {

  def range(start:Int, end: Int):List[Int] = {

    def go(l: List[Int], i:Int):List[Int] = {
      if (i == end) i :: l else i :: go(l, i+1)
    }

    go(List(), start)

  }

  def main(args: Array[String]): Unit = {

    println(range(4,9))
  }

}
