package com.google.android.samples.dynamicfeatures

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val intentsTestRule = IntentsTestRule(MainActivity::class.java)

    @Test
    fun navigateToJava() {
        onView(withId(R.id.btn_load_java))
            .perform(click())

        intended(hasComponent(MainActivity.javaSampleClassname))
    }

    @Test
    fun navigateToKotlin() {
        onView(withId(R.id.btn_load_kotlin))
            .perform(click())

        intended(hasComponent(MainActivity.kotlinSampleClassname))
    }
}
