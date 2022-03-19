package `7_Adapter_Facade`.Adapter

class Target: Target_Interface {
    override fun sendRequest() {
        println("Send request fast")
    }

    override fun receiveFeedback() {
        println("Receive feedback")
    }
}