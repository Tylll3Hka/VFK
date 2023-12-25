import api.VkApi
import api.events.onMessage
import io.github.cdimascio.dotenv.dotenv

fun main() {
    val dotenv = dotenv()
    val vk = VkApi(dotenv["TOKEN"].toString(), dotenv["GROUP_ID"].toInt())
    vk.onMessage {
        println(this)
    }
    vk.startLongPolling()
}