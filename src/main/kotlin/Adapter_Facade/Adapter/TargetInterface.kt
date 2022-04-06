package Adapter_Facade.Adapter

interface TargetInterface {
    fun sendRequest(): Unit

    fun receiveRequest(): Unit
}