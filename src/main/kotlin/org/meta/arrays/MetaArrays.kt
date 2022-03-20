package org.meta.arrays

class MetaArrays {
    /*
        Given 2 arrays A and B of length N,
        determine if there is a way to make A equal to B by reversing
        any sub-arrays from array B any number of times.
    */
    fun areTheyEqual(arr_a: Array<Int>, arr_b: Array<Int>): Boolean {
        if (arr_a.isEmpty() || arr_b.isEmpty()) return false
        if (arr_a.size != arr_b.size) return false
        arr_a.sort()
        arr_b.sort()
        return arr_a.contentEquals(arr_b)
    }

    fun findSignatureCounts(arr: Array<Int>): Array<Int> {

        return emptyArray()
    }
}