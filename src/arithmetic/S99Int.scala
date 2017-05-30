package arithmetic {
  class S99Int(val start: Int) {
    import S99Int._

    def isPrime: Boolean = {
      val primes = 2 #:: Stream.from(3,2)
      (start > 1) && !primes.takeWhile(_ <= Math.sqrt(start)).exists( p => start % p == 0)
    }

    def isCoprimeTo(to: Int):Boolean = gcd(start, to) == 1

    //def totient():Int = Stream.cons(1, Stream.from(2,start).filter(_.isCoprimeTo(start))).length
    def totient():Int = Stream.from(1).takeWhile(_ <= start).filter(_.isCoprimeTo(start)).length

  }

  object S99Int {
    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

    def gcd(m:Int, n:Int): Int = {
      if (n ==0)  m else gcd(n, m % n)
    }






    def main(args: Array[String]): Unit = {
//      println(2.isPrime)
//      println(gcd(36, 63))
//      println(35.isCoprimeTo(64))
//      println(35.isCoprimeTo(50))
      println(10.totient())
    }
  }


}