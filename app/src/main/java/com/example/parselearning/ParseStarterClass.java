package com.example.parselearning;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mQJ3CY0S7y6GdkEfsxVMwdclIHe0GJwktgIpy415")
                .clientKey("F7svcaYMugoQeAUacBycvfkagGFo9EPQ6M0Cwnmc")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
