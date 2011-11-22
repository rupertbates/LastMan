package lastmanconsole

object LastMan extends App {

  override def main(args: Array[String]) {
    Data.getGames
      .map(getScore(Data.getLeague,_))
      //.filter(t => !Data.alreadyPicked.contains(t._2))
      .sortWith((a, b) => a._4 > b._4)
      .foreach(Console.println(_))

  }
  def getScore(league : List[String], game : (String, String)) = {
    val pos1 = league indexOf game._1
    val pos2 = league indexOf game._2
    val highestPosition = math.min(pos1, pos2)

    (game, league(highestPosition), highestPosition + 1, math.abs(pos1 - pos2))
  }
}