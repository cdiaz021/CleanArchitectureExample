package com.utad.cleanarchitecture;


import com.activeandroid.ActiveAndroid;
import com.activeandroid.app.Application;

/**
 * Created by cdiaz on 15/2/17.
 */

public class MVPApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);

    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
