package com.cheezycode.quotesviewmodel

import android.content.Intent
import androidx.test.espresso.Espresso.*

import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.hamcrest.CoreMatchers.allOf
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest{

    @get:Rule
    val activityScenarioRule= activityScenarioRule<MainActivity>()
    @Test
   fun test_nextButton_click_changeQuote(){
       onView(withId(R.id.btnNext)).perform(click())
       onView(withId(R.id.btnNext)).perform(click())
       onView(withId(R.id.btnNext)).perform(click())
       onView(withId(R.id.quoteText)).check(matches(withText("Difficulties increase the nearer we get to the goal.")))
   }
    @Test
    fun testShareButton(){
       Intents.init()
        val expected= allOf(hasAction(Intent.ACTION_SEND))
        onView(withId(R.id.floatingActionButton)).perform(click())
        intended(expected)
        Intents.release()
    }

    @Test
    fun testNotes(){
        onView(withId(R.id.nextActivity) ).perform(click())

        onView(withId(R.id.titles) ).perform(typeText("hello"))
        onView(withId(R.id.description) ).perform(typeText("nitesh"), ViewActions.closeSoftKeyboard())

        onView(withId(R.id.add) ).perform(click())
        onView(withId(R.id.finalText) ).check(matches(withText("title: hello  descrption: nitesh")))

    }
}















