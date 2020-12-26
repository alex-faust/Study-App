package com.magic.studyapp.MDC;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.magic.studyapp.R;

public class BottomNavigation extends AppCompatActivity implements
                                              BottomNavigationView.OnNavigationItemSelectedListener
{
    //https://www.material.io/design/components/bottom-navigation.html
    BottomNavigationView bottomNavigationView;
    TextView txt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation_mdc);

        bottomNavigationView = findViewById(R.id.bottomnavigation_id);
        txt = findViewById(R.id.bottomNavigationTextId);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        int id = item.getItemId();

        switch (id)
        {
            case R.id.music_id:
                txt.setText(getResources().getText(R.string.bottom_nav_music));
                return true;
            case R.id.favorite_id:
                txt.setText(getResources().getText(R.string.bottom_nav_favorite));
                return true;
            case R.id.nearby_id:
                txt.setText(getResources().getText(R.string.bottom_nav_nearby));
                return true;
        }
        return false;


        /*
        kotlin  version ^
        when(item.itemId)
        {
            R.id.item1 ->
            {
            // Respond to navigation item 1 reselection
         }
         R.id.item2 ->
         {
            // Respond to navigation item 2 reselection
         }
      }*/



    }
}
