package `7_Adapter_Facade`.Adapter

class Adapter(adaptee: Adaptee): TargetInterface {
    private val currentAdaptee: Adaptee = adaptee

    override fun sendRequest() {
        currentAdaptee.sendRequestFast()
    }

    override fun receiveRequest() {
        currentAdaptee.receiveRequestFast()
    }
}