fun main(){
        print("Enter number for calculate: ")
    var num = readLine()!!.toInt()
    if((num<100) && (num>=0)){
        var fac = factorial(num)
        var fibo = fibonanci(num)

        var sum = fac-fibo
        print("$num Factorial minus Fibonanci number $num is $sum")
    }
}

fun factorial(num:Int):Int {
    var fact = 1
        println("Calculation $num Factorial")

    for(i in 1..num ){
        fact *= i
        println("$i! = $fact")
    }
    println()
    return fact
}

fun fibonanci(num:Int):Int {
    var f0 = 0
    var f1 = 1
    var f3 = 1

    println("Calculation Fibonanci number $num")
    println("f0 = $f0")
    println("f1 = $f1")

    for (i in 2..num){
        f3 = f0+f1
        println("f$i = $f3")

        f0 = f1
        f1 = f3
    }
    println("Value of Fibonanci is $f3")
    return f3
 }
