package BridgePattern

class TVFactory {

    fun createTV(type: String): AbstractTV {
        if (type == "Sony") {
            return SonyTV()
        } else {
            throw Exception("We don't have provided TV!")
        }
    }
}