package `7_Adapter_Facade`.Adapter

class Target: TargetInterface {
    override fun sendRequest() {
        println("Send request")
    }

    override fun receiveRequest() {
        println("Receive request")
    }
}