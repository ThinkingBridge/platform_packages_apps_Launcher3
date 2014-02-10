package com.android.launcher3.settings;

import android.os.Bundle;
import android.content.Context;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.Preference.OnPreferenceClickListener;

import com.android.launcher3.R;

public class SettingsActivity extends PreferenceActivity implements OnPreferenceClickListener {
    private Preference mRestart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);

        mRestart = findPreference(SettingsProvider.KEY_SETTINGS_RESTART);
        mRestart.setOnPreferenceClickListener(this);
    }

    @Override
    public boolean onPreferenceClick(Preference preference)
    {
        if (preference == mRestart) {
            System.exit(0);
            return true;
        } else {
            return false;
        }
    }
}