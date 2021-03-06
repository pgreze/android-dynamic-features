package com.google.android.samples.dynamicfeatures.ondemand

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.hamcrest.CoreMatchers.containsString
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KotlinSampleActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule<KotlinSampleActivity>(KotlinSampleActivity::class.java)

    @Test
    fun display() {
        onView(withText(containsString("Kotlin")))
            .check(matches(isDisplayed()))
    }
}
