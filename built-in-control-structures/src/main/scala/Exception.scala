object Exception {
  def throws1{
    throw new IllegalArgumentException
  }

  def throw2(n: Int){
    val half =
      if(n % 2 == 0)
        n / 2
      else
        throw new RuntimeException("n must be even")
    half
  }

  def throw3{
    import java.io.FileReader
    import java.io.FileNotFoundException
    import java.io.IOException

    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException =>
      case ex: IOException =>
    }
  }

  def finally1{
    import java.io.FileReader
    val file = new FileReader("input.txt")
    try {

    } finally {
      file.close()
    }
  }

  def urlFor(path: String): Unit = {
    import java.net.URL
    import java.net.MalformedURLException

    try {
      new URL(path)
    } catch {
      case e: MalformedURLException =>
        new URL("http://www.scala-lang.org")
    }

  }

}
