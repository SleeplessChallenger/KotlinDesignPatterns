package `7_Adapter_Facade`.Adapter

interface Adaptee_Interface {
    fun sendRequestFast(): Unit

    fun receiveFeedbackViaMail(): Unit
}