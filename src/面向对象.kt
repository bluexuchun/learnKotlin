/*
 * 面向对象
 */

class Rect(var height:Int,var width:Int){
    fun area(){
        println("计算矩形的面积")
    }
    fun cir(){
        println("计算矩形的周长")
    }
}

fun main(args: Array<String>) {
    var rect01 = Rect(20,10)
    println("矩形的高度是 ${rect01.height} 矩形的宽度是 ${rect01.width}")
    rect01.area()
    rect01.cir()
}


