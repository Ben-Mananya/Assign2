fun main(arg:Array<String>){
    print("Input value A:  ")
    var a = readLine()!!.toInt()

    print("Input value B: ")
    var b = readLine()!!.toInt()

    print("Input value C:  ")
    var c = readLine()!!.toInt()

    if(a>b){
        if(a>c){
            print("Max value is A")
        }else{
            print("Max value is C")
        }
    }else if(b>c){
            print("Max value is B")
        }else{
            print("Max value is C")
        }


 }

