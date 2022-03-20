package org.meta.arrays

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MetaArraysTest {
    private val testMetaArrays: MetaArrays = MetaArrays()

    @Test
    fun areTheyEqual() {
        val array1 = arrayOf<Int>(1, 2, 3, 4)
        val array2 = arrayOf<Int>(1, 4, 3, 2)
        assertTrue(testMetaArrays.areTheyEqual(array1, array2))
    }

    @Test
    fun findSignatureCounts() {
        assertTrue(true)
    }
}

