package com.htcdiurno.bcrllamadatlfn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by juanrajc on 20/12/2017.
 */

public class BCRtlfn extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        String phoneNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        Toast.makeText(context, "Llamas al número: "+phoneNumber, Toast.LENGTH_LONG).show();

    }

}
