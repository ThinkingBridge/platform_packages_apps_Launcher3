package com.android.launcher3.settings;

import android.os.Bundle;
import android.view.MenuItem;
import android.preference.PreferenceActivity;

import com.android.launcher3.R;

public class AboutActivity extends PreferenceActivity
{
    private final String KEY_VERSION = "about_version";
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.about);
        
        // Get the version
        String versionName;
        try {
            versionName = getPackageManager().getPackageInfo("com.android.launcher3", 0).versionName;
        } catch (Exception e) {
            versionName = "0.0.0";
        }
        findPreference(KEY_VERSION).setSummary(versionName);
        
        // This is not the first activity
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }
}