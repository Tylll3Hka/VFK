import api.Events
import api.Methods
import api.VkApi
import api.events.onMessage
import api.events.onMessageTyping
import io.github.cdimascio.dotenv.dotenv

fun main() {
    val dotenv = dotenv()
    val vk = VkApi(dotenv["TOKEN"].toString(), dotenv["GROUP_ID"].toInt())

    vk.onMessageTyping {
        println(this)
    }

    vk.call(Methods.Messages.send, arrayListOf(

    ))

    vk.startLongPolling()
}