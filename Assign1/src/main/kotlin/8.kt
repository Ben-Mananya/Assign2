fun main(arg:Array<String>){
    //8.1
    var sum = 0
    for(i:Int in 10 downTo 1 ){
        print("$i ")
        sum += i
    }
    println("\nSum = $sum")


    //8.2
    var sum2 = 0
    for(i:Int in 1 .. 19 ){
        if(i%2 !=0 ){
           sum2 += i
           print("$i ")
        }
    }
    println("\nSum = $sum2")


    //8.3

    var sum3 = 1
    var result = 0
    for(i in 1 .. 10 ){
        if(i%2 !=0 ){
            print("$sum3 ")
            result += sum3
            sum3 += 2
        }else{
            sum3 *= -1
            result += sum3
            print("$sum3 ")
            sum3 = Math.abs(sum3)+2
        }
    }
    println("\nSum = $result")
    }


