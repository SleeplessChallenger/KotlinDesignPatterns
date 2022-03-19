package `7_Adapter_Facade`.Adapter

class TargetAdapter(currObject: Target_Interface): Adaptee_Interface {
    val currentTarget = currObject

    override fun sendRequestFast() {
        currentTarget.sendRequest()
    }

    override fun receiveFeedbackViaMail() {
        currentTarget.receiveFeedback()
    }
}