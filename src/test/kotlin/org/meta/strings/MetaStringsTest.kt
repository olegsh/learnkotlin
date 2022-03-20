package org.meta.strings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MetaStringsTest {
    private val testMetaStrings: MetaStrings = MetaStrings()

    @Test
    fun oneEditAway1() {
        assertTrue(testMetaStrings.oneEditAway("abc", "ab"))
    }

    @Test
    fun oneEditAway2() {
        assertTrue(testMetaStrings.oneEditAway("abc", "adc"))
    }

    @Test
    fun oneEditAway3() {
        assertFalse(testMetaStrings.oneEditAway("abc", "abcde"))
    }

    @Test
    fun oneEditAway4() {
        assertTrue(!testMetaStrings.oneEditAway("abc", "adz"))
    }
}
