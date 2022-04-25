package BridgePattern

class SuperRemote(currTvFactory: TVFactory): AbstractRemote() {

    init {
        super.tvFactory = currTvFactory
    }

    fun up() {
        val channel: Int = this.showCurrentChannel()
        this.putNewChannel(channel + 1)
    }

    fun down() {
        val channel: Int = this.showCurrentChannel()
        this.putNewChannel(channel - 1)
    }
}