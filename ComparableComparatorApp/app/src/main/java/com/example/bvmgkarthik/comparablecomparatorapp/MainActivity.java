package com.example.bvmgkarthik.comparablecomparatorapp;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    TextView t1;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.bodytext);

        next = (Button) findViewById(R.id.buttonnextact);

        System.out.println("@@@###@@@" + "1st Activity onCreate");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });


//
//        Uri uriSms = Uri.parse("content://sms/inbox");
//        Cursor cursor = getContentResolver().query(uriSms, new String[]{"_id", "address", "date", "body"},null,null,null);
//
//        cursor.moveToFirst();
//        while  (cursor.moveToNext())
//        {
//            String address = cursor.getString(1);
//            String body = cursor.getString(3);
//
//            if (address.equalsIgnoreCase("VK-IPAYTM")) {
//                System.out.println("======&gt; Mobile number =&gt; " + address);
//                System.out.print("=====&gt; SMS Text =&gt; " + body);
//                t1.setText(body.toString());
//            }
//
//        }
//
//
//
//
//        ArrayList<Man> list = new  ArrayList<Man>();
//
//        Man m1 = new Man(25,"zing","Bangaloore");
//        Man m2 = new Man(24,"siri","perarala");
//        Man m3 = new Man(26,"subu","kunkalamoru");
//
//        list.add(0,m1);
//        list.add(1,m2);
//        list.add(2, m3);
//
//        for(Man mn : list) {
//            System.out.println("before sort: " + mn.getAge());
//        }
//
//        Collections.sort(list);
//        for(Man mn : list) {
//            System.out.println("After sort by age: " + mn.getAge());
//        }
//
//        Collections.sort(list,Man.nameCompar);
//        for(Man mn : list) {
//            System.out.println("After sort by name: " + mn.getName());
//        }
//
//        Collections.sort(list,Man.addressCompar);
//        for(Man mn : list) {
//            System.out.println("After sort by address: " + mn.getAddress());
//        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("@@@###@@@" + "1st Activity onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("@@@###@@@" + "1st Activity onRestart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("@@@###@@@" + "1st Activity onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("@@@###@@@" + "1st Activity onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("@@@###@@@" + "1st Activity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("@@@###@@@" + "1st Activity onDestroy");
    }

}
