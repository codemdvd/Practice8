package ru.mirea.apasov.practice8;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class Server implements LifecycleObserver {
    private String TAG = "lifecycle";
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void onAny(LifecycleOwner source, Lifecycle.Event event) {
        Log.d(TAG, "Current State: " + event);
    }
}
