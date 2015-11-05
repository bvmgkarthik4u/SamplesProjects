package com.example.bvmgkarthik.comparablecomparatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        System.out.println("@@@###@@@"+"2nd Activity onCreate");
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("@@@###@@@" + "2nd Activity onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("@@@###@@@" + "2nd Activity onRestart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("@@@###@@@" + "2nd Activity onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("@@@###@@@" + "2nd Activity onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("@@@###@@@" + "2nd Activity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("@@@###@@@" + "2nd Activity onDestroy");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
