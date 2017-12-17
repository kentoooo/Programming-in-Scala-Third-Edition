object Files {
  val filesHere = (new java.io.File(".")).listFiles

  def printFiles(): Unit = {
    for(file <- filesHere)
      println(file)
  }

  def printScalaFiles(){
    val filesHere = (new java.io.File(".")).listFiles
    for (file <- filesHere if file.getName.endsWith(".scala"))
      println(file)
  }

  def printScalaFile2(): Unit = {
    for (file <- filesHere)
      if (file.getName.endsWith(".scala"))
        println(file)
  }

  def printScalaFile3(): Unit ={
    for(
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala")
    ) println(file)
  }

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList
  def grep(pattern: String) =
    for(
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- fileLines(file)
      if line.trim.matches(pattern)
    ) println(file + ": " + line.trim)
  grep(".*gcd.*")

  def grepGcd2(pattern: String) =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + trimmed)
   grep(".*gcd.*")

  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
    } yield file

}
