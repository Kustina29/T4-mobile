package com.example.studentcontactapp.utils

import android.content.Context

class PrefManager(context: Context) {

    private val pref = context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

    // SIMPAN LOGIN
    fun setLogin(username: String, remember: Boolean) {
        pref.edit()
            .putString("username", username)
            .putBoolean("isLoggedIn", true)
            .putBoolean("remember", remember)
            .apply()
    }

    // CEK LOGIN
    fun isLoggedIn(): Boolean {
        return pref.getBoolean("isLoggedIn", false)
    }

    // AMBIL USERNAME
    fun getUsername(): String {
        return pref.getString("username", "User") ?: "User"
    }

    // REMEMBER ME
    fun isRemember(): Boolean {
        return pref.getBoolean("remember", false)
    }

    // LOGOUT
    fun logout() {
        pref.edit().clear().apply()
    }
}