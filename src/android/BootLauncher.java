package uk.co.ilee.bootlauncher;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.content.BroadcastReceiver;
import android.content.Context;

public class BootLauncher extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent serviceIntent = new Intent(context, uk.co.ilee.CordovaApp.class);
        serviceIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(serviceIntent);
    }
}
