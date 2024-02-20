package com.example.hotstuffkotlin.ui.settings

import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.example.hotstuffkotlin.BuildConfig
import com.example.hotstuffkotlin.R
import com.example.hotstuffkotlin.models.Building
import com.example.hotstuffkotlin.utils.DatabaseHelper
import com.example.hotstuffkotlin.utils.SharedPreferenceHelper
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity

class SettingsFragment : PreferenceFragmentCompat(), SharedPreferences.OnSharedPreferenceChangeListener {
    private lateinit var preferenceHelper: SharedPreferenceHelper

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
        preferenceHelper = SharedPreferenceHelper.getInstance(requireContext())

        val rate = findPreference<Preference>(getString(R.string.key_rate))
        rate?.setOnPreferenceClickListener {
            // do nothing for now
            true
        }

        val feedback = findPreference<Preference>(getString(R.string.key_feedback))
        feedback?.setOnPreferenceClickListener {
            visitDestination(getString(R.string.link_issue))
            true
        }

        val share = findPreference<Preference>(getString(R.string.key_share))
        share?.setOnPreferenceClickListener {
            shareApp()
            true
        }

        val terms = findPreference<Preference>(getString(R.string.key_terms))
        terms?.setOnPreferenceClickListener {
            visitDestination(getString(R.string.link_terms))
            true
        }

        val sourceCode = findPreference<Preference>(getString(R.string.key_source_code))
        sourceCode?.setOnPreferenceClickListener {
            visitDestination(getString(R.string.link_repo))
            true
        }

        val openSource = findPreference<Preference>(getString(R.string.key_open_source))
        openSource?.setOnPreferenceClickListener {
            startActivity(Intent(context, OssLicensesMenuActivity::class.java))
            true
        }

        val version = findPreference<Preference>(getString(R.string.key_version))
        version?.summary = BuildConfig.VERSION_NAME

    }
    override fun onResume() {
        super.onResume()
        preferenceManager.sharedPreferences?.registerOnSharedPreferenceChangeListener(this)
    }
    override fun onPause() {
        super.onPause()
        preferenceManager.sharedPreferences?.unregisterOnSharedPreferenceChangeListener(this)
    }
    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        when (key) {
            getString(R.string.key_theme) -> {
                when (preferenceHelper.getThemePref()) {
                    getString(R.string.theme_light) -> setTheme(AppCompatDelegate.MODE_NIGHT_NO)
                    getString(R.string.theme_dark) -> setTheme(AppCompatDelegate.MODE_NIGHT_YES)
                    getString(R.string.theme_system) -> setTheme(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                }
            }
            getString(R.string.key_currency) -> {
                // do nothing for now
            }
            getString(R.string.key_buildingName),
            getString(R.string.key_buildingType),
            getString(R.string.key_buildingDesc) -> {
                val building = Building()
                building.name = preferenceHelper.getPref(key).toString()
                building.type = preferenceHelper.getPref(key).toString()
                building.description = preferenceHelper.getPref(key).toString()
                DatabaseHelper(requireContext()).updateBuilding(building)
            }
        }
    }

    private fun shareApp() {
        // TODO: ADD LINK TO PLAY STORE AND OPEN IN NEW JAVA INTENT
    }
    private fun visitDestination(link: String) {
        try {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(link)))
        } catch (e: Exception) {
            Toast.makeText(context, R.string.toast_no_app, Toast.LENGTH_LONG).show()
            e.printStackTrace()
        }
    }
    private fun setTheme(mode: Int) {
        AppCompatDelegate.setDefaultNightMode(mode)
    }
}