import ChecksumAccumulator.calculate
object FailWinterSpringSummer extends App{
  for(season <- List("fail","winter","spring"))
    println(season + " :" + calculate(season))
}
