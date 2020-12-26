package com.magic.studyapp.MDC;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.magic.studyapp.R;

public class MDCChoices extends AppCompatActivity
{
    Button botNav;
    Intent i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mdc_choices);

        botNav = findViewById(R.id.bottom_navigation);

        botNav.setOnClickListener(v ->
        {
            i = new Intent(MDCChoices.this, BottomNavigation.class);
            startActivity(i);
        });


    }
}
