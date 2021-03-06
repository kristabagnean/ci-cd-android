package dev.cicdandroid

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun appLaunchesSuccessfully() {
        activityRule.scenario.onActivity { }
    }

}