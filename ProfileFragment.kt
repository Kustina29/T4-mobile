package com.example.studentcontactapp.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.studentcontactapp.R
import com.example.studentcontactapp.LoginActivity
import com.example.studentcontactapp.utils.PrefManager
import com.example.studentcontactapp.utils.SettingsManager

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val pref = PrefManager(requireContext())
        val settings = SettingsManager(requireContext())

        val tvUsername = view.findViewById<TextView>(R.id.tvUsername)
        val swDark = view.findViewById<Switch>(R.id.swDarkMode)
        val swNotif = view.findViewById<Switch>(R.id.swNotification)
        val btnLogout = view.findViewById<Button>(R.id.btnLogout)

        // username
        tvUsername.text = pref.getUsername()

        // state awal switch
        swDark.isChecked = settings.isDarkMode()
        swNotif.isChecked = settings.isNotificationEnabled()

        // listener
        swDark.setOnCheckedChangeListener { _, isChecked ->
            settings.setDarkMode(isChecked)
        }

        swNotif.setOnCheckedChangeListener { _, isChecked ->
            settings.setNotification(isChecked)
        }

        btnLogout.setOnClickListener {
            pref.logout()

            startActivity(Intent(requireContext(), LoginActivity::class.java))
            requireActivity().finish()
        }
    }
}