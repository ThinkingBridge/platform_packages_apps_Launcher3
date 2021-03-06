package com.android.launcher3.settings;

import android.content.Context;
import android.content.SharedPreferences;

public class SettingsProvider {

    public static String KEY_PREFERENCES = "preferences";

    public static String KEY_SETTINGS_RESTART = "settings_restart";
    public static String KEY_INTERFACE_ICONPACK = "interface_iconpack";

    public static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(KEY_PREFERENCES, Context.MODE_MULTI_PROCESS);
    }

    public static int getInt(Context context, String key, int defaultValue) {
        return getPreferences(context).getInt(key, defaultValue);
    }

    public static boolean getBoolean(Context context, String key, boolean defaultValue) {
        return getPreferences(context).getBoolean(key, defaultValue);
    }

    public static String getString(Context context, String key, String defaultValue) {
        return getPreferences(context).getString(key, defaultValue);
    }

    public static void putInt(Context context, String key, int value) {
        getPreferences(context).edit().putInt(key, value).commit();
    }

    public static void putBoolean(Context context, String key, boolean value) {
        getPreferences(context).edit().putBoolean(key, value).commit();
    }

    public static void putString(Context context, String key, String value) {
        getPreferences(context).edit().putString(key, value).commit();
    }
    
    public static void remove(Context context, String key) {
    	getPreferences(context).edit().remove(key).commit();
    }
}