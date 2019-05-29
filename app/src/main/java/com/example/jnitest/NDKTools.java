package com.example.jnitest;

public class NDKTools {
    static {
        System.loadLibrary("ndkdemotest-jni");
    }

    public static native String getStringFromNDK();
}
