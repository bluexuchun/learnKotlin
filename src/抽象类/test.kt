package 抽象类

fun main(args: Array<String>) {
    var man = Man("嘻嘻")
    var man1 = Man("哈哈")
    var man2 = Man("嘿嘿")
    var humans = listOf<Human>(man,man1,man2)
    for (h in humans){
        println(h is Man)
        h.eat()
    }
}