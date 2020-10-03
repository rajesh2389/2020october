object Test2  extends App {

  val a = 10805 // correct  1324
 val p = List(1080,1120) // 123,12345,1324,,12356
  // 213.4, 132.4,124.3  123.4
  //,120.45,111.45,123.35,12.45,12.32,11.45,1234.45,8123.45
  // 124,123,234,12345,12354,11234,1324,12356,1234567

  //12354

  val b = a.toString().split("")



  var i = 0

  for( i <- 0 to p.length -1  by 1) {

    if (b.length == p(i).toString().split("").length) {
     // println("if1")
       var count = 0
      for (j <- 0 to b.length -1  by 1){
        if (b(j) != p(i).toString().split("").apply(j) ) {
      //    println("enter-" + j + b(j) + "-" + p(i).toString().apply(j))
          //println (  + "-" + p(i).toString().apply(j).isInstanceOf )
          count = count + 1
        }
      }
        if(count == 1) { println("match" + p(i) )}
        else println("No Match" + p(i))


    }

    else if(b.length == p(i).toString().split("").length + 1) {
      println("if2")
      var e = 0;
      var f = 0 ;
      var count = 0;
       for (j <- 0 to p(i).toString().split("").length -1  by 1){
        if(b(e) == p(i).toString().split("").apply(f) ) {
       //   println("--" + b(e) + "--" + p(i).toString().split("").apply(f) )
          e= e+1
          f=f+1

        } else {
          count = count+1
          e=e+1
         // println("Else missmatch case --" + b(e) + "--" + p(i).toString().split("").apply(f) + "---" + count )
        }


       }

      //println("--" + count + "--" +  e + "--" + f + "--")

      if ((count ==1 && (e -f <=1 ))|| (count ==0  ))  {
        println( p(i) +  "match")

      } else {
        println( p(i) +  "not match")
      }

    }

    else if (b.length == p(i).toString().split("").length - 1) {
      println("if3")
      var e = 0;
      var f = 0 ;
      var count = 0;
      for (j <- 0 to b.length -1   by 1){
        if(b(e) == p(i).toString().split("").apply(f) ) {

          e= e+1
          f=f+1

        } else {
          count = count+1
          f=f+1
        }


      }
      if ( (count ==0) || ((count == 1) && (f == e) || (b(e) == p(i).toString().split("").apply(f)  && count ==1)   ))  {
        println( p(i) +  "match" + "-" + count)

      } else {
        println( p(i) +  "not match")
      }


    }

    else {
      println("if4")
      println( p(i) +  "not match")
    }

    }




}
