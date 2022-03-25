package `7_Adapter_Facade`.Adapter

interface AdapteeInterface {
    fun sendRequestFast(): Unit

    fun receiveRequestFast(): Unit
}