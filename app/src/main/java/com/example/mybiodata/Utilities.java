package com.example.mybiodata;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Utilities {
    private static SharedPreferences sp;
    private SharedPreferences.Editor editor;

    public void setPref(Context context, String key, String value) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
        editor = sp.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String getPref(Context context, String key) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
        String value = sp.getString(key, null);
        return value;
    }

    public static boolean isLogin(Context context, String key) {
        sp = PreferenceManager.getDefaultSharedPreferences(context);
        String value = sp.getString(key, null);
        return value != null;
    }
}
