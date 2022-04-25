package BridgePattern

abstract class AbstractRemote {
    lateinit var tv: AbstractTV
    lateinit var tvFactory: TVFactory

    fun on(): Unit {
        this.tv.on()
    }

    fun off(): Unit {
        this.tv.off()
    }

    fun putNewChannel(channel: Int): Unit {
        this.tv.tuneChannel(channel)
    }

    fun showCurrentChannel(): Int {
        return this.tv.getChannel()
    }

    fun setNewTv(type: String) {
        try {
            this.tv = this.tvFactory.createTV(type)
        } catch (e: Exception) {
            throw e
        }
    }
}