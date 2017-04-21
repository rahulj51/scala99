package ninetynine

/**
  * Created by rahuljai on 4/21/17.
  */
object P10 {

  //encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  def encode[A](l:List[A]): List[(Int,A)] = {

    P09.pack(l).map(e => (e.length, e.head))

  }

  def main(args: Array[String]): Unit = {
    println(P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}
