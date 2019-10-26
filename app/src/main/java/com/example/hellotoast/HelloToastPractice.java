package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HelloToastPractice extends AppCompatActivity {

    public int mCount = 0;
    public TextView mTextCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast_practice);
        mTextCount =(TextView) findViewById(R.id.text_count);
    }

    public void ShowToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_info,Toast.LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {
        ++mCount;
        if (mTextCount != null)
            mTextCount.setText(Integer.toString(mCount));

    }
}
