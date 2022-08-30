package com.example.dwayer.ui

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.dwayer.R
import com.google.android.material.navigation.NavigationView


class Home : AppCompatActivity() {
    private val mDrawer: DrawerLayout? = null
    private var toolbar: Toolbar? = null
    private val nvDrawer: NavigationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        toolbar =  findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // The action bar home/up action should open or close the drawer.
        when (item.getItemId()) {
            android.R.id.home -> {
                mDrawer!!.openDrawer(GravityCompat.START)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}