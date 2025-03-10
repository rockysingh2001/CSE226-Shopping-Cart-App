// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    "com.android.tools.build:gradle:8.4.0"
    "androidx.recyclerview:recyclerview:1.3.1"
    "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"
    "androidx.room:room-runtime:2.5.2"
    "androidx.room:room-compiler:2.5.2"
}