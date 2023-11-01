package com.p1gd0g.firebase;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;

public class FirebasePlugin extends org.godotengine.godot.plugin.GodotPlugin {
    public FirebasePlugin(Godot godot) {
        super(godot);
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "Firebase";
    }
}
