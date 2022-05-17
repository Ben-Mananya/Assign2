fun main() {
    var money = 1

    while(money !=0){
        print("InEnter amount of money : ")
        money = readLine()!!.toInt()

        if(money %100 ==0 && money!=0){
            println("$money Baht can be separated into")

            if(money>=1000 ) {
                var bill = money / 1000
                money -= (bill * 1000)
                println("1000-Baht $bill bills")
            }
            if(money>=500 ) {
                var bill = money / 500
                money -= (bill * 500)
                println("500-Baht $bill bills")
            }
            if(money>=100 ){
                var bill = money/100
                money -= (bill * 100)
                println("100-Baht $bill bills")
            }

        }else{
            print("Please enter amount of money more than 100 Baht(ห้ามกรอกจำนวนเงินที่ได้เศษ 0-99 บาท ): ")
            money = 1
        }
    }//end while*/
}