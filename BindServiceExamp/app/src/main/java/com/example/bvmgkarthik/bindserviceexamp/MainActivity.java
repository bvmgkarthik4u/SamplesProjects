package com.example.bvmgkarthik.bindserviceexamp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button bn;
    TextView tv;
    BindServicce myservice;
    Boolean mBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bn = (Button) findViewById(R.id.buttonservice);
        tv = (TextView) findViewById(R.id.textservice);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random numA = new Random();

                if (mBound) {
                    int x=numA.nextInt(100),y=numA.nextInt(100);
                    int getsum = myservice.sum(x,y);
                    tv.setText(String.valueOf(x) +" and "+String.valueOf(y)+" sum is "+String.valueOf(getsum));
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intentService = new Intent(MainActivity.this,BindServicce.class);
        bindService(intentService, mConnection, Context.BIND_AUTO_CREATE);
        System.out.println("@@@@@@@@############ Done at start");

    }

    @Override
    protected void onStop() {
        super.onStop();

        if (mBound) {
            unbindService(mConnection);
            mBound = false;
        }
    }

    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {

            BindServicce.BindBinder mybunder = (BindServicce.BindBinder) iBinder;
            myservice = mybunder.getservice();
            System.out.println("@@@@@@@@############ Done");
            mBound = true;

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

            mBound = false;
        }
    };
}
