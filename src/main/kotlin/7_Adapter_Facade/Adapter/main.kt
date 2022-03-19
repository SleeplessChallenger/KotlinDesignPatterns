package `7_Adapter_Facade`.Adapter

// This is our CLIENT. It does know how to speak with Adaptee, but
// system code has changed to Target. So, when we make a call, we use Adaptee methods
// inside which we can find Target
fun main() {
    val target: Target_Interface = Target()
    val targetAdapter = TargetAdapter(target)

    println(targetAdapter.sendRequestFast())
    println(targetAdapter.receiveFeedbackViaMail())
}