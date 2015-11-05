package com.example.bvmgkarthik.customviewexmp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import  static  java.lang.System.out;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by bvmgkarthik on 18/10/15.
 */
public class CustomTextView extends TextView {


    String getText;




    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        getText = attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "text");

//        String ss = "<font color=#cc0029>Erste Farbe</font> <font color=#ffcc00>zweite Farbe</font>";
//        setText(Html.fromHtml(ss));

        setText("");
        setTags(getText);

    }

    public void setTags(String text){


        setColor(Color.RED, text.substring(0,3));
        setColor(Color.GREEN,text.substring(4,7));
    }

    public void setColor(int color,String text){


        Spannable word = new SpannableString(text);

        word.setSpan(new ForegroundColorSpan(color), 0, word.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        append(word);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
