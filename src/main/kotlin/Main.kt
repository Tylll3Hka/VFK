import api.VkApi
import api.events.onMessage
import io.github.cdimascio.dotenv.dotenv

//import util.urlquery.toUrlParams
// import util.urlquery.QEntry
// import util.urlquery.QField
//
// @QEntry(url = "https://google.com")
// class Example(
//     @QField val accessToken: String = "accesstoken@1",
//     @QField val v: String = "3.131"
// )

fun main() {
    // println(toUrlParams(Example()))

    val dotenv = dotenv()
    val vk = VkApi(dotenv["TOKEN"].toString(), dotenv["GROUP_ID"].toInt())
    vk.onMessage {
        println(this)
    }
    vk.startLongPolling()
}