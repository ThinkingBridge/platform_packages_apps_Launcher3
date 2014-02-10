package com.android.launcher3.settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.android.launcher3.R;

public class LauncherSettingsActivity extends PreferenceActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.settings);
	}
}