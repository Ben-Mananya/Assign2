fun main(arg: Array<String>){

    print("Input your salary: ")
    var salary = readLine()!!.toInt()

    if(salary>=15000){
        print("Your Welfare is 750 Bath")
    }else{
        var welfare = salary*0.05 //5%
        print("Your Welfare is $welfare Bath")
    }

}