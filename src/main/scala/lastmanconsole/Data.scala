package lastmanconsole

object Data {
  private val league = Map(
    "19-11-2011" ->
      List("Man City", "Man Utd", "Newcastle", "Chelsea", "Tottenham", "Liverpool", "Arsenal", "Aston Villa", "QPR", "West Brom", "Norwich", "Everton", "Swansea", "Stoke", "Sunderland", "Fulham", "Wolves", "Bolton", "Blackburn", "Wigan"),
    "26-11-2011" ->
      List("Man City", "Man Utd", "Tottenham", "Newcastle", "Chelsea", "Liverpool", "Arsenal", "Aston Villa", "QPR", "West Brom", "Norwich", "Everton", "Swansea", "Stoke", "Sunderland", "Fulham", "Wolverhampton", "Bolton", "Blackburn", "Wigan")
  )
  private val games = Map(
    "19-11-2011" ->
      List(("Norwich", "Arsenal"),
        ("Everton", "Wolves"),
        ("Man City", "Newcastle"),
        ("Stoke", "QPR"),
        ("Sunderland", "Fulham"),
        ("West Brom", "Bolton"),
        ("Wigan", "Blackburn"),
        ("Swansea", "Man Utd"),
        ("Chelsea", "Liverpool"),
        ("Tottenham", "Aston Villa")),
    "26-11-2011" ->
      List(("Stoke", "Blackburn"),
        ("Bolton", "Everton"),
        ("Chelsea", "Wolverhampton"),
        ("Man Utd", "Newcastle"),
        ("Norwich", "QPR"),
        ("Sunderland", "Wigan"),
        ("West Brom", "Tottenham"),
        ("Arsenal", "Fulham"),
        ("Swansea", "Aston Villa"),
        ("Liverpool", "Man City")
      ))
  val alreadyPicked = List("Norwich", "Newcastle",	"Man City",	"Arsenal", "Tottenham")

  val currentKey = "26-11-2011"

  def getLeague = league(currentKey)

  def getGames = games(currentKey)
}