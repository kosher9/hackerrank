package sock_merchant

fun main() {
    val b = arrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3)
    var count = mutableSetOf<Int>()
    b.forEach {
        count.add(it)
    }
    var a = 0
    for (i in count) {
        var s = 0
        b.forEach {
            if (i == it) s++
        }
        a += s / 2
    }
    println(a)
}