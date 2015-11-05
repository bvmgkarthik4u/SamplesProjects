package com.example.bvmgkarthik.getlogsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class MainActivity extends AppCompatActivity {


    TextView logs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logs = (TextView) findViewById(R.id.logsText);
        Log.i("Karthik","######$$$$$$%%%%%%%%%^^^^^^^^");

        try {
            //Whatever the file path is.
            File statText = new File("/Users/bvmgkarthik/AndroidStudioProjects/GetLogsApp/app/src/main/java/com/example/bvmgkarthik/getlogsapp/statsTest.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            w.write("POTATO!!!");
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest.txt");
        }

//        MyAppLogReader myAppLogReader = new MyAppLogReader();
//        myAppLogReader.getLog();

        logs.setText("king");

    }


}
