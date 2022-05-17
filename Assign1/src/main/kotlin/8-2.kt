fun main(arg:Array<String>) {
    //8.1
    var sum1 = 0
    var count = 10
    while (count >= 1) {
        print("$count ")
        sum1 += count;
        count--;
    }
    println("\nSum = $sum1")

    //8.2
    var num = 1
    var sum2 = 0
    while (num < 20) {
        if (num % 2 != 0) {
            sum2 += num;
            print("$num ")
        }
        num++
    }
    println("\nSum = $sum2")

    //8.3
    var sum3 = 1
    var result = 0
    var i = 0
    while (sum3 != 21) {
        i++
        if (i % 2 != 0) {
            print("$sum3 ")
            result += sum3
            sum3 += 2
        } else {
            sum3 *= -1
            result += sum3
            print("$sum3 ")
            sum3 = Math.abs(sum3) + 2
        }
    }
    print("\nSum = $result");


}
