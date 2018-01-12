package chapter6

/**
  * @author yuh 
  *         2018/1/12. 
  */
object MyPoint extends java.awt.Point{



}


class Point (private val x: Double,private val y: Double){

}

object Point{


  def apply(x: Double,y: Double):Point = {
    new Point(x,y)
  }

  def main(args: Array[String]): Unit = {
    new Point(1,2)
  }
}

object Other extends App{
  for (i <- 0 until args.length reverse)println(args(i))
}

object Card extends Enumeration {

  val R = Value("♥️")
  val M = Value("♣️")
  val B = Value("♠️")
  val C = Value("♦️")


  print(Card.M)
  print(Card.C)
  print(Card.B)
  print(Card.R)

  def main(args: Array[String]): Unit = {
    print(Card)
  }
}














