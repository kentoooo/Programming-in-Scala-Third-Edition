import scala.collection.mutable

object Ex2 extends App{
  val pair = (99, "luftballons")
  println(pair._1)
  println(pair._2)

  var jetSet = Set("Boeing","Airbus")
  jetSet += "Lear"
  println(jetSet.contains("Cessna"))

  val treasureMap = mutable.Map[Int,String]()
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on ground")
  treasureMap += (3 -> "Dig.")
  println(treasureMap(2))
}
