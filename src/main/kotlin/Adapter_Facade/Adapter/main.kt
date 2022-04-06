package Adapter_Facade.Adapter

fun main() {
    val currentAdaptee: Adaptee = Adaptee()
    val wrappedAdaptee = Adapter(currentAdaptee)

    wrappedAdaptee.sendRequest()
    wrappedAdaptee.receiveRequest()
}