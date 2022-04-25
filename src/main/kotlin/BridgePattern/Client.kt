package BridgePattern

class Client {
    fun main() {
        val tvFactory = TVFactory()
        val remoteSony = SuperRemote(tvFactory)
        println("Connect your remote to the TV")
        remoteSony.setNewTv("Sony")
        remoteSony.on()
        remoteSony.up()
        remoteSony.down()
        remoteSony.off()
    }
}


fun main() {
    val client = Client()
    client.main()
}