package edu.deepdive.cnm.lifecycledemo;

import static edu.deepdive.cnm.lifecycledemo.MainActivity.LOG_TAG;

import android.app.Application;
import android.util.Log;

public class LifecycleApplication extends Application {


  @Override
  public void onCreate() {
    super.onCreate();
    Log.d(LOG_TAG, "LifecycleApplication::onCreate");
  }

}
