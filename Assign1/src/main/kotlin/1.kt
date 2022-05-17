fun main(arg:Array<String>){
    print("Input P: ")
    var p = readLine()!!.toInt()

    print("Input Q: ")
    var q = readLine()!!.toInt()

    if((p>1) && (q>1)) {
        println("Please Input Only 0 and 1")
    }else if((p<0) && (q<0)) {
        println("Please Input Only 0 and 1")
    }else if((p==1) && (q==1)) {
       println("1 XOR 1 = 0")
    }
    else if((p==0) && (q==0)) {
        println("0 XOR 0 = 0")
    }else if((p==1) && (q==0)) {
        println("1 XOR 0 = 1")
    }else {
        println("0 XOR 1 = 1")
    }
}