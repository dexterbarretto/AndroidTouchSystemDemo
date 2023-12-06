package com.dexterbarretto.touchdemo.ui

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.TextView
import com.dexterbarretto.touchdemo.Constants

class CustomView @JvmOverloads constructor(context: Context, attrs: AttributeSet) :
    TextView(context, attrs) {

    /**
     * override and skip calling super to avoid call to View.OnTouchEvent. Return value has no effect.
     */
    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        Log.i(Constants.LOG_TAG, "View $text->dispatchTouchEvent : ${Constants.getTouchEventAction(event?.action)}")
        return super.dispatchTouchEvent(event)
    }

    /**
     * return true to consume event or false to call parent's onTouchEvent
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.i(Constants.LOG_TAG, "View $text->onTouchEvent : ${Constants.getTouchEventAction(event?.action)}")
        return super.onTouchEvent(event)
    }
}
