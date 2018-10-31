package 抽象类

class Man(name:String): Human(name){
    override fun eat(){
        println("${name} eat")
    }
}