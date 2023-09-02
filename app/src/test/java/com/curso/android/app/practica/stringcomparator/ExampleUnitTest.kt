package com.curso.android.app.practica.stringcomparator

import com.curso.android.app.practica.stringcomparator.model.StringComparatorModel
import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun testTrue() {
        val stringComparatorModel = StringComparatorModel()
        val text1 = "Hola"
        val text2 = "Hola"

        val result = stringComparatorModel.compareStrings(text1, text2)

        assertTrue(result)
    }

    @Test
    fun testFalse() {
        val stringComparatorModel = StringComparatorModel()
        val text1 = "Hola"
        val text2 = "Mundo"

        val result = stringComparatorModel.compareStrings(text1, text2)

        assertFalse(result)
    }

    @Test
    fun testEmpty() {
        val stringComparatorModel = StringComparatorModel()
        val text1 = ""
        val text2 = ""

        val result = stringComparatorModel.compareStrings(text1, text2)

        assertTrue(result)
    }

    @Test
    fun testBlanksTrue() {
        val stringComparatorModel = StringComparatorModel()
        val text1 = "Hola como estas?"
        val text2 = "Hola como estas?"

        val result = stringComparatorModel.compareStrings(text1, text2)

        assertTrue(result)
    }

    @Test
    fun testBlanksFalse() {
        val stringComparatorModel = StringComparatorModel()
        val text1 = "Hola, como estas?"
        val text2 = "Hola como andas?"

        val result = stringComparatorModel.compareStrings(text1, text2)

        assertTrue(result)
    }

    @Test
    fun testUpperOrLowercases() {
        val stringComparatorModel = StringComparatorModel()
        val text1 = "hola"
        val text2 = "Hola"

        val result = stringComparatorModel.compareStrings(text1, text2)

        assertTrue(result)
    }
}