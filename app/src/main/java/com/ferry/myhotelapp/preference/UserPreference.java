package com.ferry.myhotelapp.preference;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Student6 on 11/02/2016.
 */
public class UserPreference {
    private Context mContext;

    private String KEY_EMAIL = "email";
    private String PREF_NAME = "user_hotel_app_prefs";
    private SharedPreferences mUserPreference;
    private SharedPreferences.Editor editor;

    public UserPreference(Context mContext){
        this.mContext = mContext;
        mUserPreference = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = mUserPreference.edit();
    }

    public void setEmail(String email){
        editor.putString(KEY_EMAIL, email);
        editor.commit();
    }

    public String getEmail(){
        return mUserPreference.getString(KEY_EMAIL,"");
    }

    public void clear(){
        editor.clear();
        editor.commit();
    }
}
