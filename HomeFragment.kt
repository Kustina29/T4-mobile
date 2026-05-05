package com.example.studentcontactapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.studentcontactapp.R
import com.example.studentcontactapp.utils.PrefManager

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val tv = view.findViewById<TextView>(R.id.tvWelcome)

        val pref = PrefManager(requireContext())
        val username = pref.getUsername()

        tv.text = "Welcome $username"
    }
}