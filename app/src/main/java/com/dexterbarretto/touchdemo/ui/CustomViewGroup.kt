package com.dexterbarretto.touchdemo.ui

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.LinearLayout
import com.dexterbarretto.touchdemo.Constants

class CustomViewGroup@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defInt: Int = 0
) : LinearLayout(context, attrs, defInt)  {

    /**
     * return true to call onInterceptTouchEvent or false to consume event
     */
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.i(Constants.LOG_TAG, "ViewGroup->dispatchTouchEvent : ${Constants.getTouchEventAction(ev?.action)}")
        return super.dispatchTouchEvent(ev)
    }

    /**
     * return true to consume event and false to pass it to children
     */
    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        Log.i(Constants.LOG_TAG, "ViewGroup->onInterceptTouchEvent : ${Constants.getTouchEventAction(ev?.action)}")
        super.onInterceptTouchEvent(ev)
        return true
    }

    /**
     * return true to consume event or false to call parent's onTouchEvent
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.i(Constants.LOG_TAG, "ViewGroup->onTouchEvent : ${Constants.getTouchEventAction(event?.action)}")
        return super.onTouchEvent(event)
    }
}
