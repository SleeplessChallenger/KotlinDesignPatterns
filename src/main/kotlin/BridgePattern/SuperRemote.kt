package BridgePattern

class SuperRemote(currTvFactory: TVFactory): AbstractRemote() {

    init {
        super.tvFactory = currTvFactory
    }

    // in another Remote we may have different naming of these methods,
    // but they will interact via UPPER-ABSTRACTION through composed object
    // with another abstraction which was implemented by some concrete class (i.e. SonyTV)

    fun up() {
        val channel: Int = this.showCurrentChannel()
        this.putNewChannel(channel + 1)
    }

    fun down() {
        val channel: Int = this.showCurrentChannel()
        this.putNewChannel(channel - 1)
    }
}