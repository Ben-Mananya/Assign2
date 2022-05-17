fun main(){
    print("Enter input number: ")
    var num = readLine()!!.toInt()

    println("Prime number is")
    prime(num)
}
fun prime(num:Int){
    for (i in 1..num) {
        var p = 1
        var k = 2
        while (k < i) {
            if (i % k == 0) {
                p = 0
            }
            k++
        }
        if (p == 1) {
            print("$i ")
        }
    }


}