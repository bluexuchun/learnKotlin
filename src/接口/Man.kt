package 接口

class Man(var name:String):Human(),IMan{
    override fun test() {
        println("${name} 123")
    }

    override fun eat() {
        println("${name} eat")
    }
}