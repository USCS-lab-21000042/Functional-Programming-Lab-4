object test extends App{
    // def toUpper(x:String):String={
    //     x.toUpperCase()
    // }
    // def toLower(x:String):String={
    //     x.toLowerCase()
    // }

    var toLower=(x:String)=>x.toLowerCase()
    val toUpper=(x:String)=>x.toUpperCase()

    var list=List("kamaL","Asiri","jayantha")
    //println(toLower("TREDSDSD"))
    var out=list.map(list=>toLower(list))
    println(out)
    out=list.map(list=>toUpper(list))
    println(out)
}