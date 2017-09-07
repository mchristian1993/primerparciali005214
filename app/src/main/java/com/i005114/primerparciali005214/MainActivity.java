package com.i005114.primerparciali005214;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.bnv_1);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_1:
                        LinearFragment unoFragment = new  LinearFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, unoFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "ITEM 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_2:
                      RelativeFragment dosFragment = new RelativeFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fl_1, dosFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        Toast.makeText(MainActivity.this, "ITEM 2", Toast.LENGTH_SHORT).show();
                        break;

                }
                return true;
            }
        });
    }
    }

