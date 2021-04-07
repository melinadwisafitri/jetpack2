package com.example.android.ajp_1.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

object LiveDataUtils {
    fun <T> getVAlue(liveData: LiveData<T>): T{
        val data = arrayOfNulls<Any>(1)
        val latch = CountDownLatch(1)

        val observer = object : Observer<T>{
            override fun onChanged(t: T) {
                data[0] = t
                latch.countDown()
                liveData.removeObserver(this)
            }
        }

        liveData.observeForever(observer)

        try{
            latch.await(2, TimeUnit.SECONDS)
        }catch (e: InterruptedException){
            e.printStackTrace()
        }

        return data[0] as T
    }
}