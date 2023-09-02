package com.curso.android.app.practica.stringcomparator

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.curso.android.app.practica.stringcomparator.view.MainActivity
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.*
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import org.junit.Before

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Before
    fun setup() {
        // Inicia la actividad antes de cada test
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testStringComparison() {
        // Acciones en la UI
        Espresso.onView(ViewMatchers.withId(R.id.string1)).perform(ViewActions.typeText("Hola"))
        Espresso.onView(ViewMatchers.withId(R.id.string2)).perform(ViewActions.typeText("Mundo"))
        Espresso.onView(ViewMatchers.withId(R.id.comparate)).perform(ViewActions.click())

        // Verifica el resultado en el TextView
        val resultText = "No Coinciden"
        Espresso.onView(ViewMatchers.withId(R.id.textViewResult))
            .check(ViewAssertions.matches(ViewMatchers.withText(resultText)))
    }
}