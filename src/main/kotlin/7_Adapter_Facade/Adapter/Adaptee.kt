package `7_Adapter_Facade`.Adapter

class Adaptee: Adaptee_Interface {
    override fun sendRequestFast() {
        println("Send request in a fast manner")
    }

    override fun receiveFeedbackViaMail() {
        println("Receive feedback via mail")
    }
}