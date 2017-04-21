package ninetynine

/**
  * Created by rahuljai on 4/21/17.
  */
object P11 {

  //encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  def encodeModified[A](l:List[A]): List[Any] = {

    P09.pack(l).map(e => if (e.length ==1) e.head else Tuple2(e.length, e.head))

  }

  def main(args: Array[String]): Unit = {
    println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}
