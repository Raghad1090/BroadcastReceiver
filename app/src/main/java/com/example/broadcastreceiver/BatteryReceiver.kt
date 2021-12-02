package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class BatteryReceiver(val textView : AppCompatTextView) : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val batteryLevel = intent?.getIntExtra("Level",10)

        textView.text = if(batteryLevel?:0 > 0) batteryLevel.toString()
        else ""
    }

}