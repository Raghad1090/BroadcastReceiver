package com.example.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    lateinit var BatteryReceiver : BatteryReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var battery = findViewById<AppCompatTextView>(R.id.batteryState)


        BatteryReceiver = BatteryReceiver(battery)

        registerReceiver(BatteryReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(BatteryReceiver)
    }
}