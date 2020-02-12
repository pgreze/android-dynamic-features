package com.google.android.samples.dynamicfeatures.ondemand;

import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;

public class JavaSampleActivityTest {

    @Rule
    public ActivityTestRule<JavaSampleActivity> activityRule =
            new ActivityTestRule<>(JavaSampleActivity.class);

    @Test
    public void display() {
        onView(withText(containsString("Kotlin")))
                .check(matches(isDisplayed()));
    }
}
