var runLoop:Boolean = true
fun main(){
        while(runLoop) {
            print("Enter day : ")
            var day = readLine()!!.toInt()
            print("Enter month : ")
            var month = readLine()!!.toInt()
            print("Enter year : ")
            var year = readLine()!!.toInt()
            checkInput(day,month,year)
        }

}
fun checkInput(day:Int,month:Int,year:Int){

        if(year>=2500 && year<=2565){
            if(month>0 && month<=12){
                if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
                    if(day<=31){
                        print("Correct!")
                        runLoop = false
                    }else{
                        println("Wrong value(s)")
                    }
                }
                if(month==4 || month==6 || month==9 || month==11){
                    if(day<=30){
                        print("Correct!")
                        runLoop = false
                    }else{
                        println("Wrong value(s)")

                    }
                }
                if(month==2){
                    if((year-543) %4 ==0){
                        if(day<=29){
                            print("Correct!")
                            runLoop = false
                        }else{
                            println("Wrong value(s)")

                        }
                    }else{
                        if(day<=28){
                            print("Correct!")
                            runLoop = false
                        }else{
                            println("Wrong value(s)")

                        }
                    }
                }
            }
        }else{
            println("Wrong value(s)")
        }


}