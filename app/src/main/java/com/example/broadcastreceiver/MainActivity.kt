package com.example.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    lateinit var BatteryReceiver : BatteryReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val battery: TextView = findViewById(R.id.batteryState)


        BatteryReceiver = BatteryReceiver(battery as AppCompatTextView)


        registerReceiver(BatteryReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))

//        registerReceiver(BatteryReceiver, IntentFilter(Intent.ACTION_BATTERY_LOW))
//
//        registerReceiver(BatteryReceiver, IntentFilter(Intent.ACTION_BATTERY_OKAY))

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(BatteryReceiver)
    }
}