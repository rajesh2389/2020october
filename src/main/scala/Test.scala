object Test extends App {

  val a = 1008

  // 213.4, 132.4,124.3  123.4

  val b = a.toString().split("")

  var i = 0

   for( i <- 0 to b.length-2 by 1) {

     if (b(i) != "." && b(i+1) != ".") {
     val c = b.clone()
      // println(c.mkString + "-1")
     //(c.foreach(x => println(x)) )


       val x = c(i)
     val y = c(i+1)
     c(i) = y
     c(i+1) =  x
     println(c.mkString)
   }
     else if (b(i) != ".")
       {

       }
     else {

       val c = b.clone()

     val x = c(i-1)
     val y = c(i+1)
     c(i-1) = y
     c(i+1) =  x
       println(c.mkString)
      }
   }
}