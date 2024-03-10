package com.shadow.nymbleMusic

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.SharedPreferences
import android.content.ComponentName
import android.content.Context
import android.media.MediaMetadata
import android.media.session.MediaController
import android.media.session.MediaSession
import android.media.session.MediaSessionManager
import android.widget.RemoteViews

import android.util.Log
import androidx.core.content.ContextCompat
import androidx.core.app.ActivityCompat
import android.Manifest
import android.content.pm.PackageManager
import android.content.Intent
import io.flutter.plugin.common.MethodChannel

/**
 * Implementation of App Widget functionality.
 */
class NymbleMusicWidget : AppWidgetProvider() {
    // private lateinit var mediaSessionToken: MediaSession.Token
    // private lateinit var mediaController: MediaController


    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)

        Log.d("MyWidgetProvider", "Initializing MediaSession and MediaController")

        // Update widget
        updateAppWidget(context, appWidgetManager)
    }

    override fun onReceive(context: Context?, intent: android.content.Intent?) {
        super.onReceive(context, intent)

        Log.d("MyWidgetProvider", "Received intent")

        // // Handle media playback state changes
        // if (intent?.action == "android.media.session.playstatechanged") {
        //     context?.let { updateAppWidget(it, AppWidgetManager.getInstance(it)) }
        // }
    }

    private fun updateAppWidget(context: Context, appWidgetManager: AppWidgetManager) {
        Log.d("MyWidgetProvider", "Updated intent")
    }
}

