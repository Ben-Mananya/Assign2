fun main(){
    print("Enter first number: ")
    var num1 = readLine()!!.toInt()
    print("Enter second number: ")
    var num2 = readLine()!!.toInt()
    print("Enter last number: ")
    var num3 = readLine()!!.toInt()

    var max = mymax(num1,num2,num3)
    var min = mymin(num1,num2,num3)

    var sum = max+min
    print("Total Max plus Min is $sum")
}
fun mymax(num1:Int,num2:Int,num3:Int):Int{
    var result = 0
    if(num1>num2){
        if(num1>num3){
            println("Max value = $num1")
            result = num1
        }else{
            println("Max value = $num3")
            result = num3
        }
    }else if(num2>num3){
        println("Max value = $num2")
        result = num2
        }else{
            println("Max value = $num3")
            result = num3
        }

    return  result
}
fun mymin(num1:Int,num2:Int,num3:Int):Int{
    var result = 0
    if(num1<num2){
        if(num1<num3){
            println("Min value = $num1")
            result = num1
        }else{
            println("Min value = $num3")
            result = num3
        }
    }else if(num2<num3){
        println("Min value = $num2")
        result = num2

        }else{
            println("Min value = $num3")
            result = num3
        }
    return  result
}
