object test extends App{
    // def interst(x:Double):Double=x match{
    //     case x if x<=20000 => x*2/100
    //     case x if x>20000 && x<=200000 => x*4/100.0
    //     case x if x>200000 && x<=2000000 =>x*3.5/100.0
    //     case x if x>2000000 => x*6.5/100.0
    // }

    val interst =(x:Double)=>x match{
        case x if x<=20000 => x*2/100
        case x if x>20000 && x<=200000 => x*4/100.0
        case x if x>200000 && x<=2000000 =>x*3.5/100.0
        case x if x>2000000 => x*6.5/100.0
    }

    //println("Interest :"+interst(252))
    println("Interest :"+ interst(252))
    
}