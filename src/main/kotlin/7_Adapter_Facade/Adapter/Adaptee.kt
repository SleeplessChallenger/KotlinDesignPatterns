package `7_Adapter_Facade`.Adapter

class Adaptee: AdapteeInterface {
    override fun sendRequestFast() {
        println("Send request fast")
    }

    override fun receiveRequestFast() {
        println("receive request fast")
    }
}