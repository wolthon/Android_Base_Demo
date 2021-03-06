package com.tiny.demo.firstlinecode.kotlin.primer.project05

/**
 * desc kotlin中的lambda语法
 *
 * @author wangjianzhou@qding.me
 * @version version
 * @date 2018/8/13 10:32 AM
 */
fun main(args: Array<String>): Unit {
    // 需要用花括号括起来
    // Kotlin中的lambda允许省略很多没有用的冗余信息
    val thread = Thread({ -> println("Kotlin中Lambda基本写法") })
    thread.start()

    // Lambda的返回值是自动推断的。
    // 如果方法体没有返回值，也没有方法体的话用Unit表示
    val thread0 = Thread({ -> Unit })
    thread0.start()

    // 下面方法无返回值，最后打印的就是kotlin.Unit
    val s = { x: String, y: String -> println(x + y) }
    println(s("王蛋蛋", "的芭比"))

    // 如果Lambda没有参数，可以省略箭头符号
    val thread1 = Thread({ println("如果Lambda没有参数，可以省略箭头符号") })
    thread1.start()

    // 如果Lambda是函数的最后一个参数，可以将大括号放在小括号外面
    val thread2 = Thread() { println("如果Lambda是函数的最后一个参数，可以将大括号放在小括号外面") }
    thread2.start()

    // 如果函数只有一个参数且这个参数是Lambda, 则可以省略小括号
    val thread3 = Thread { println("如果函数只有一个参数且这个参数是Lambda, 则可以省略小括号") }
    thread3.start()
}