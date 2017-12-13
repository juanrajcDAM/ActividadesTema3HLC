package com.htcdiurno.serviciohs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent servicio=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciaServicio(View view){

        startService(servicio=new Intent(this, MyService.class));

    }

    public void paraServicio(View view){

        stopService(servicio);

    }

}
