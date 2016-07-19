import scala.util.parsing.json._

class IosApp (id: Int, name: String, summary: String, 
              price: Double, reviewsCount: Int) {
   
}

object AppleApiClient {
  val url = "https://itunes.apple.com/us/rss/toppaidapplications/limit=5/json"

  def topAppsJson: String = scala.io.Source.fromURL(url).mkString

  def topAppsParsed = {
    JSON.parseFull(this.topAppsJson) match {
        case Some(m: Map[String, Any]) => m
        case _ => throw new Exception("Call to Apple returned no data")
    }
  }

  

}

object Results extends App {
    println(AppleApiClient.topAppsParsed("feed"))
}
