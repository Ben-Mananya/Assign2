fun main(arg:Array<String>){
    print("Enter a number: ")
    var num = readLine()!!.toInt()
    var fact = 1

    for(i in 1..num ){
        fact *= i
        println("$i! = $fact")
    }

}