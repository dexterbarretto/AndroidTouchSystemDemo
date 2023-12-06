package com.dexterbarretto.touchdemo

import android.view.MotionEvent

object Constants {
    val LOG_TAG = "TOUCH_EVENT_LOGGER"

    fun getTouchEventAction(action: Int?): String =
        action?.let { MotionEvent.actionToString(it) } ?: "Unidentified"
}