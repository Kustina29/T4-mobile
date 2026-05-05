package com.example.studentcontactapp.utils

import android.content.Context

class SettingsManager(context: Context) {

    private val pref = context.getSharedPreferences("settings_prefs", Context.MODE_PRIVATE)

    fun setDarkMode(enabled: Boolean) {
        pref.edit().putBoolean("dark_mode", enabled).apply()
    }

    fun isDarkMode(): Boolean {
        return pref.getBoolean("dark_mode", false)
    }

    fun setFontSize(size: Int) {
        pref.edit().putInt("font_size", size).apply()
    }

    fun getFontSize(): Int {
        return pref.getInt("font_size", 14)
    }

    fun setNotification(enabled: Boolean) {
        pref.edit().putBoolean("notification", enabled).apply()
    }

    fun isNotificationEnabled(): Boolean {
        return pref.getBoolean("notification", true)
    }
}