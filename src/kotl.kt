fun main() {
    Name()
val identity=Join("florence" , 58)
println(identity)
var nan=hay("florence")
println(nan)
    message("Sarah")


}
fun Name () {
var name="akirachix"
    var h=name[0]
    var e=name[3]
    var r=name[4]
    println("$h$e$r")

    }
fun Join(name:String,age:Int):String{
    return("Hi,my name is " + name + " and am " + age + " years old ")
}
fun hay(f:String):Int{
    var hab=f.length
    return hab

}
fun message(name:String){
    var name="That's me!"
    if(name==name){
        println("Thats me!")
    }
    else{
        println("I do not know who that is")
    }
}

