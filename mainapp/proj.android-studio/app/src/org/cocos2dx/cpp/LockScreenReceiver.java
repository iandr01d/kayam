package org.cocos2dx.cpp;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import asia.chumbaka.kitkitProvider.KitkitDBHandler;

/**
 * Created by ingtellect on 1/9/17.
 */

public class LockScreenReceiver extends BroadcastReceiver {

    private KitkitDBHandler dbHandler;
    private AppActivity activity;

    public LockScreenReceiver(KitkitDBHandler dbHandler, AppActivity activity) {
        this.dbHandler = dbHandler;
        this.activity = activity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("LockScreenReceiver","broadcast received");

        String action = intent.getAction();

        //If the screen was just turned on or it just booted up, start your Lock Activity
        if(action.equals(Intent.ACTION_SCREEN_OFF) || action.equals(Intent.ACTION_BOOT_COMPLETED))
        {
            Log.d("LockScreenReceiver","Delete user");
            dbHandler.deleteCurrentUser();
            activity.finish();
            Log.d("LockScreenReceiver","Start intent");
            try {
                Intent i = new Intent(Intent.ACTION_MAIN);
                i.setComponent(new ComponentName("com.enuma.todoschoollockscreen","com.enuma.todoschoollockscreen.LockScreenActivity"));
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(i);

            }
            catch (Exception e)
            {
                Log.d("LockScreenReceiver","start lockscreen failed");

            }
        }
    }
}