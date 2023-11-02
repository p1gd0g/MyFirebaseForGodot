package com.p1gd0g.firebase;

import androidx.annotation.NonNull;

import com.google.firebase.analytics.FirebaseAnalytics;
import android.util.Log;
import org.godotengine.godot.Godot;

import java.util.Objects;

public class FirebasePlugin extends org.godotengine.godot.plugin.GodotPlugin {

    private FirebaseAnalytics mFirebaseAnalytics;
    private static final String TAG = "FirebasePlugin";


    public FirebasePlugin(Godot godot) {
        super(godot);

        try {
            mFirebaseAnalytics = FirebaseAnalytics.getInstance(Objects.requireNonNull(getActivity()));
            Log.d(TAG, "Firebase initialized.");
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }

    }

    @NonNull
    @Override
    public String getPluginName() {
        return "Firebase";
    }
}
