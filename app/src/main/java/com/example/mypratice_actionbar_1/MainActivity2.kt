package com.example.mypratice_actionbar_1

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mypratice_actionbar_1.databinding.ActivityMain2Binding
import com.example.mypratice_actionbar_1.databinding.ActivityMainBinding


//使用程式碼製作menu
class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main2)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add(0, 0, 0, "AAA")
        menu?.add(0, 1, 1, "BBB")
            ?.setIcon(com.google.android.material.R.drawable.ic_call_answer)
            ?.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS)

        var mySubMenu = menu?.addSubMenu(1, 2, 3, "CCC")
        mySubMenu?.add(1, 3, 3, "DDD")
        mySubMenu?.add(1, 4, 4, "EEE")
//        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.title) {
            "AAA" -> {Log.d("myTag", "AAA click")}
            "BBB" -> {Log.d("myTag", "BBB click")}
        }
        when(item.itemId){
            2 -> {Log.d("myTag", "CCC click")}
            3 -> {Log.d("myTag", "DDD click")}
            4 -> {Log.d("myTag", "EEE click")}
        }
        return super.onOptionsItemSelected(item)
    }
}