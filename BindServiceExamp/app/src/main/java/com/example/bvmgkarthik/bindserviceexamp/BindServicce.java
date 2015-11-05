package com.example.bvmgkarthik.bindserviceexamp;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by bvmgkarthik on 19/10/15.
 */
public class BindServicce extends Service {

    public int numbers=0;

    private final IBinder bindBinder = new BindBinder();

    public class BindBinder extends Binder{
        BindServicce getservice(){
            return BindServicce.this;
        }
    }

    public int sum(int a,int b){
        return a+b;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return bindBinder;
    }
}
