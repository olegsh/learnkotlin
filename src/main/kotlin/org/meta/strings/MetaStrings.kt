package org.meta.strings

import kotlin.math.abs

class MetaStrings {
    fun oneEditAway(s: String, t: String): Boolean {
        if (s.isEmpty() || t.isEmpty()) return false
        if (s.equals(t, true)) return true
        val diffDist: Int = abs((s.length - t.length))
        if (diffDist != 0 && diffDist != 1) return false
        val srcArr: CharArray = s.toCharArray()
        val trgArr: CharArray = t.toCharArray()
        srcArr.sort()
        trgArr.sort()
        val myMap = srcArr.map { it to it }.toMap()
        val lower: Int  = if (srcArr.size > trgArr.size) trgArr.size else srcArr.size
        val litmus = arrayListOf<Boolean>()
        for (i in 0 until lower) {
            if (myMap[trgArr[i]] == null) {
                litmus.add(false)
            }
        }
        return litmus.size <= 1
    }
}