package BridgePattern

class SonyTV: AbstractTV() {

    var station: Int = 0
    override fun on() {
        System.out.println("TV was turned on!")
    }

    override fun off() {
        System.out.println("TV was turned off!")
    }

    override fun tuneChannel(channel: Int) {
        this.station = channel;
        System.out.println("${this.station} is our station")
    }

    override fun getChannel(): Int {
        return this.station
    }
}