package com.example.problemstatement;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

    boolean started;

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onCreate() {
        String msg = "Service Created";
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (started == false){
            started = true;
            String msg = "Service started";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        } else {
            String msg = "Service is still running";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {

        String msg = "Service exited";
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}
