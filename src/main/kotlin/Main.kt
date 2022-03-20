import org.meta.strings.MetaStrings
import org.meta.arrays.MetaArrays

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val metaString = MetaStrings()
    println("abc and ab: " + metaString.oneEditAway("abc", "ab"))
    println("abc and adc: " + metaString.oneEditAway("abc", "adc"))
    println("abc and adcde: " + metaString.oneEditAway("abc", "abcde"))
    println("abc and adz: " + metaString.oneEditAway("abc", "adz"))
    println("bc and bcd: " + metaString.oneEditAway("bc", "bcd"))
    println("cd and bcd: " + metaString.oneEditAway("cd", "bcd"))
    println("abc and xabc: " + metaString.oneEditAway("abc", "xabc"))

    val metaArray = MetaArrays()
    val array1 = arrayOf<Int>(1, 2, 3, 4)
    val array2 = arrayOf<Int>(1, 4, 3, 2)
    println(metaArray.areTheyEqual(array1, array2))
}
