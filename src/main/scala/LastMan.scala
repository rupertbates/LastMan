package


object LastMan extends App {

  override def main(args: Array[String]) {
    val league =  List("Man City", "Man Utd", "Newcastle", "Chelsea", "Tottenham", "Liverpool", "Arsenal", "Aston Villa", "QPR", "West Brom", "Norwich", "Everton", "Swansea", "Stoke", "Sunderland", "Fulham", "Wolves", "Bolton", "Blackburn", "Wigan")
    val games = List(("Norwich", "Arsenal"), ("Everton", "Wolves"), ("Man City", "Newcastle"), ("Stoke", "QPR"), ("Sunderland", "Fulham"), ("West Brom", "Bolton"), ("Wigan", "Blackburn"), ("Swansea", "Man Utd"), ("Chelsea", "Liverpool"), ("Tottenham", "Aston Villa"))
    //games.foreach(Console.println(_))

    val scores = games
      .map(g => getScore(league, g))
      .sortWith((a : (String, Int), b : (String, Int)) => a._2 > b._2)
      .foreach(Console.println(_))


    //Console.println(games.head)
  }
  def getScore(league : List[String], game : (String, String)) = {
    //Console.println(game)
    val pos1 = getLeague indexOf game._1
    val pos2 = getLeague indexOf game._2
    //Console.println("pos1=" + pos1 + " pos2=" + pos2)
    (getLeague(math.min(pos1, pos2)), math.abs(pos1 - pos2))
  }
  def getLeague =  List("Man City", "Man Utd", "Newcastle", "Chelsea", "Tottenham", "Liverpool", "Arsenal", "Aston Villa", "QPR", "West Brom", "Norwich", "Everton", "Swansea", "Stoke", "Sunderland", "Fulham", "Wolves", "Bolton", "Blackburn", "Wigan")
}