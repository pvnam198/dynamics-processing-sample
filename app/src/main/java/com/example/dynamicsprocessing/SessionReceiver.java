package com.example.dynamicsprocessing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.audiofx.Equalizer;
import android.os.Build;
import android.util.Log;

public final class SessionReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.d("DynamicsProcessingSample", "SessionReceiver onReceive");

        if (intent.getAction() != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                String action = intent.getAction();
                if (action == null) {
                    action = "";
                }
                int intExtra = intent.getIntExtra(Equalizer.EXTRA_AUDIO_SESSION, 0);
                String stringExtra = intent.getStringExtra(Equalizer.EXTRA_PACKAGE_NAME);
                Log.d("DynamicsProcessingSample", "data: " + intent.getData() + ", EXTRA_AUDIO_SESSION: " + intExtra + ", EXTRA_PACKAGE_NAME: " + stringExtra);
//                if (stringExtra == null) {
//                    stringExtra = "Global Mix";
//                }
            }
        }
    }
}
