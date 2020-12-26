package com.magic.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.magic.studyapp.MDC.MDCChoices;

public class MainActivity extends AppCompatActivity
{
    Button ttsBtnMain, mdc;
    Intent i;

    @Override
    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        ttsBtnMain = findViewById(R.id.text_to_speech_btn);
        mdc = findViewById(R.id.materialDesignbtn);

        ttsBtnMain.setOnClickListener(this::getTTS);
        mdc.setOnClickListener( v ->
        {
            i = new Intent(MainActivity.this, MDCChoices.class);
            startActivity(i);
        });
    }

    public void getTTS(View v)
    {
        i = new Intent(MainActivity.this, TextToSpeechActivity.class);
        startActivity(i);
    }
}