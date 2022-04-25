package BridgePattern

abstract class AbstractTV {

    abstract fun on(): Unit
    abstract fun off(): Unit
    abstract fun tuneChannel(channel: Int): Unit
    abstract fun getChannel(): Int
}