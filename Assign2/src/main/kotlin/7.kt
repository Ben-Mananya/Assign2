fun main(){
    print("Enter an array size: ")
    var arrayNum = IntArray(readLine()!!.toInt())
    var num:Int = arrayNum.size
    for(i in 0 until num){
        print("Enter integer "+(i+1)+": ")
        arrayNum[i] = readLine()!!.toInt()
    }
    sortInOrder(num,arrayNum)
    println("")
    reverseOrder(num,arrayNum)

}
fun sortInOrder(num:Int,arrayNum:IntArray){
    println("In order:")
     for (i in 0 until num){
         arrayNum.sort()
    print(arrayNum[i])
    print(" ")
    }
}
fun reverseOrder(num:Int,arrayNum:IntArray){
    println("Reverse order:")
    for (i in num-1 downTo 0){
        arrayNum.sortedWith(nullsLast(reverseOrder()))
        print(arrayNum[i])
        print(" ")
    }
}
/* println("In order:")
  for (i in 0 until num){
       print(arrayNum[i])
       print(" ")
   }

   println()
   println("Reverse order:")
   for (i in num-1 downTo  0){
       print(arrayNum[i])
       print(" ")
   }*/


