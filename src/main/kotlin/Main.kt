import kotlin.math.abs

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    println("abc and ab: " + oneEditAway("abc", "ab"))
    println("abc and adc: " + oneEditAway("abc", "adc"))
    println("abc and adcde: " + oneEditAway("abc", "abcde"))
    println("abc and adz: " + oneEditAway("abc", "adz"))
    println("bc and bcd: " + oneEditAway("bc", "bcd"))
    println("cd and bcd: " + oneEditAway("cd", "bcd"))
    println("abc and xabc: " + oneEditAway("abc", "xabc"))
}

fun oneEditAway(s: String, t: String): Boolean {
    if (s.isNullOrEmpty() || t.isNullOrEmpty()) return false
    if (s.equals(t, true)) return true
    var diffDist: Int = abs((s.length - t.length))
    if (diffDist != 0 && diffDist != 1) return false
    val srcArr: CharArray = s.toCharArray()
    val trgArr: CharArray = t.toCharArray()
    srcArr.sort()
    trgArr.sort()
    val myMap = srcArr.map { it to it }.toMap();
    var lower: Int  = if (srcArr.size > trgArr.size) trgArr.size else srcArr.size
    val litmus = arrayListOf<Boolean>()
    for (i in 0 until lower) {
        if (myMap[trgArr[i]] == null) {
            litmus.add(false);
        }
    }
    return litmus.size <= 1
}