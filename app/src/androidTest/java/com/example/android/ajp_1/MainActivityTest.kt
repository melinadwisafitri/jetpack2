package com.example.android.ajp_1

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.example.android.ajp_1.utils.EspressoIdlingResource
import com.example.android.ajp_1.utils.FakeDataDummy
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
class MainActivityTest{
    private val dumyMovie = FakeDataDummy.generateDummyMovie()
    private val dumyTvShow = FakeDataDummy.generateDummyTv()

    @get:Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun funSetup(){
        IdlingRegistry.getInstance().register(EspressoIdlingResource.expressoTestIdlingResource)
    }

    @After
    fun tearDown(){
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.expressoTestIdlingResource)
    }

    @Test
    fun loadMovie(){
        onView(withId(R.id.navigation_movie)).perform(click())
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dumyMovie.size))
    }

    @Test
    fun loadDetailTvShow(){
        onView(withId(R.id.navigation_tvShow)).perform(click())
        onView(withId(R.id.rv_tvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.btn_bck_tvshow)).perform(click())

    }

    @Test
    fun loadDetailMovie(){
        onView(withId(R.id.navigation_movie)).perform(click())
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_title_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.btn_bck_movie)).perform(click())

    }

    @Test
    fun loadTvSHow(){
        onView(withId(R.id.navigation_tvShow)).perform(click())
        onView(withId(R.id.rv_tvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dumyTvShow.size))
    }

    @Test
    fun checkNavigation(){
        onView(withId(R.id.navigation_movie)).perform(click()).check(matches(isDisplayed()))
        onView(withId(R.id.navigation_tvShow)).perform(click()).check(matches(isDisplayed()))
    }
}