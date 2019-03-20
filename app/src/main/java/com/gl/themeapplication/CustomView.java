package com.gl.themeapplication;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;

public class CustomView extends AppCompatButton {

    public  com.gl.themeapplication.CustomView mButtonText;

    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }



    public void init() {
        mButtonText =(com.gl.themeapplication.CustomView) findViewById(R.id.customButton);
        StringBuffer reverseString = new StringBuffer("Submit");
        reverseString.reverse();
        mButtonText.setText(reverseString);
    }

}
