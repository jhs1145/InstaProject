package com.example.instaproject.navigation.util

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService

class MsgFireBaseIdService : FirebaseMessagingService(){
    fun onTokenRefresh() {
        // Get updated InstanceID token.
        val refreshedToken: String = FirebaseMessaging.getInstance().token.toString()
        Log.d(TAG, "Refreshed token: $refreshedToken")

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        //sendRegistrationToServer(refreshedToken)
    }
}