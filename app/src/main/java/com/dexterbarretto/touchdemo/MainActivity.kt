package com.dexterbarretto.touchdemo

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    /**
     * override and skip calling super to consume event. Return value has no effect.
     */
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.i(Constants.LOG_TAG, "Activity->dispatchTouchEvent : ${Constants.getTouchEventAction(ev?.action)}")
        return super.dispatchTouchEvent(ev)
    }

    /**
     * Receives the event if onTouchEvent of all relevant children don't consume it.
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.i(Constants.LOG_TAG, "Activity->onTouchEvent : ${Constants.getTouchEventAction(event?.action)}")
        return super.onTouchEvent(event)
    }
}