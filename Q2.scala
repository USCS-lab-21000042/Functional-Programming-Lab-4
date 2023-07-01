import scala.io.StdIn
object test extends App{
    def checkpositive(x:Int):String= x match{
        case x if x>=0 => "Positive"
        case x if x<0   => "Negative"
    }

    def checkvalue(x:Int):String=x match{
        case x if x%2==0 => "Even"
        case x if x%2!=0 => "Odd"
    }
    println("Enter number")
    var x:Int = StdIn.readInt()
    println(s"${x} is ${checkpositive(x)}" )
    println(s"${x} is ${checkvalue(x)}")
}