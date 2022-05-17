fun main(arg:Array<String>){
    print("Enter a Fibonanci number: ")
    var num = readLine()!!.toInt()

    var f0 =0
    var f1 =1
    var sum =0


    for(f in 0..num){
        println("f$f = $f0")
        if(f==num){
            println("Value of Fibonanci is  $f0")
        }
        sum = f0+f1
        f0 = f1
        f1 = sum
        }

}

