import java.util.Scanner
import java.util.Stack

fun main() {
    val stack1 = Stack<String>()
    val stack2 = Stack<String>()
    while(true) {
        val scan = Scanner(System.`in`).next()
        if ("push" in scan) {
            push(stack1, (scan.substring(4, scan.length)))
            println("Дело сделано")
        }
        if ("pop" in scan) {
            println(pop(stack1, stack2))
        }
    }
}

fun push(stack: Stack<String>, str:String){
    stack.push(str)
}

fun pop(stack1: Stack<String>, stack2: Stack<String>): String {
    while (!stack1.empty()){
        stack2.push(stack1.pop())
    }
    val res = stack2.pop()
    while (!stack2.empty()){
        stack1.push(stack2.pop())
    }
    return res
}