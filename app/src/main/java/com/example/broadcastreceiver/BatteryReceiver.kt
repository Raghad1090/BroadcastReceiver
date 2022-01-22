package com.example.broadcastreceiver

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class BatteryReceiver(val textView : AppCompatTextView) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val batteryLevel = intent.getIntExtra("Level",0)

        textView.text = if( batteryLevel > 15 ) "Normal"
        else if (batteryLevel <=  15 ) "low battery"
        else "charge"
    }
}