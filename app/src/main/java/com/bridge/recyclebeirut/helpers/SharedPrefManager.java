package com.bridge.recyclebeirut.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class SharedPrefManager {

    private static SharedPrefManager mInstance;
    private static Context mCtx;

    public static final String SHARED_PREF_NAME = "bridgepmt";


    public static final String KEY_USER_ID = "id";
    public static final String KEY_USER_NAME = "name";
    private static final String KEY_PASSWORD = "password";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_USER_TOKEN = "token";
    public static final String KEY_FIRST_SWIPE = "KEY_FIRST_SWIPE";

    private SharedPrefManager(Context context) {
        mCtx = context;
    }

    public static synchronized SharedPrefManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPrefManager(context);
        }
        return mInstance;
    }


//    public boolean userDetails(User user) {
//        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putInt(KEY_USER_ID, user.getId());
//        editor.putString(KEY_USER_NAME, user.getName());
//        editor.putString(KEY_PASSWORD, user.getName());
//        editor.putString(KEY_EMAIL, user.getEmail());
//        editor.putString(KEY_USER_TOKEN, user.getToken());
//
//        editor.apply();
//        return true;
//    }

    public boolean isLoggedIn() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);

        //Toast.makeText(mCtx,   sharedPreferences.getString(KEY_USER_TOKEN,null), Toast.LENGTH_LONG).show();


        if (sharedPreferences.getString(KEY_USER_TOKEN, null) != null)
            return true;
        return false;
    }

//    public User getUser() {
//        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
//        return new User(
//                sharedPreferences.getInt(KEY_USER_ID, 0),
//                sharedPreferences.getString(KEY_USER_NAME, null),
//                sharedPreferences.getString(KEY_USER_EMAIL, null),
//                sharedPreferences.getString(KEY_USER_GENDER, null)
//        );
//    }

    public boolean logout() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        Toast.makeText(mCtx, "Loged out Successfully", Toast.LENGTH_LONG).show();

        return true;
    }

    public boolean isFirsttime() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        if (sharedPreferences.getBoolean(KEY_FIRST_SWIPE, true)) {
            editor.putBoolean(KEY_FIRST_SWIPE, false);
            editor.apply();
            return true;
        } else {
            return false;
        }
    }


//    public  void pushStringList( List list, String uniqueListName) {
//        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//
//        for (int i = 0; i < list.size(); i++) {
//            editor.remove(uniqueListName + i);
//            editor.putString(uniqueListName + i, list.get(i).toString());
//        }
//        editor.apply();
//    }

//    public  void pushactivityList( List<Activity> list) {
//        String key = "activityList";
//        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        Gson gson = new Gson();
//        String json = gson.toJson(list);
//
//        editor.putString(key, json);
//        editor.apply();
//    }

//    public  void pushprojectList( List<ProjectList> list) {
//        String key = "projectList";
//        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        Gson gson = new Gson();
//        String json = gson.toJson(list);
//        editor.putString(key, json);
//        editor.apply();
//    }


//        public  List<Activity> pullactivityList() {
//            String key = "activityList";
//            SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
//            List<Activity> result ;
//            Gson gson = new Gson();
//            String json = sharedPreferences.getString(key, "");
//            Type type = new TypeToken<List<Activity>>(){}.getType();
//            result = gson.fromJson(json,type);
//            if(result==null)
//            {
//                result = new ArrayList<>();
//            }
//        return result;
//    }
//

//    public  List<ProjectList> pullprojectList() {
//            String key = "projectList";
//            SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
//            List<ProjectList> result ;
//            Gson gson = new Gson();
//            String json = sharedPreferences.getString(key, "");
//            Type type = new TypeToken<List<ProjectList>>(){}.getType();
//            result = gson.fromJson(json,type);
//            if(result==null)
//            {
//                result = new ArrayList<>();
//            }
//        return result;
//    }

//    public  List<String> pullStringList(String uniqueListName) {
//        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
//        List<String> result = new ArrayList<>();
//        int size = sharedPreferences.getInt(uniqueListName + "_size", 0);
//
//        for (int i = 0; i < size; i++) {
//            result.add(sharedPreferences.getString(uniqueListName + i, null));
//        }
//        return result;
//    }
}
