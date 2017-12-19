package com.htcdiurno.practicaintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.Nullable;

/**
 * Created by juanrajc on 19/12/2017.
 */

public class ServicioOperacion extends IntentService {

    public ServicioOperacion() {

        super("Servicio de operación");

    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        double n = intent.getExtras().getDouble("numero");

        SystemClock.sleep(5000);

        Intent i = new Intent();

        i.setAction(MainActivity.ReceptorOperacion.ACTION_RESP);

        i.addCategory(Intent.CATEGORY_DEFAULT);

        i.putExtra("resultado", n*n);

        sendBroadcast(i);
    }
}