package com.example.mishr.testproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.transition.TransitionManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mishr on 31/08/2017.
 */

public class TabActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    boolean visible;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabactivity);

    tabLayout = (TabLayout)findViewById(R.id.tablayout);
        viewPager = (ViewPager)findViewById(R.id.veiwpager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new HomeFragment(),"We");
        viewPagerAdapter.addFragments(new TopPaidFragments(),"Me");
        viewPagerAdapter.addFragments(new TopFreeFragment(),"Us..!!");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    public void MagicClick(View view) {

        Toast.makeText(this,"It was 7 Degrees..!! COLD",Toast.LENGTH_SHORT).show();
    }

    public void MagicClick2(View view) {
        Toast.makeText(this,"Ek aur TRIP toh Bntaa hai..!!",Toast.LENGTH_SHORT).show();
    }

    public void MagicClick3(View view) {
        Toast.makeText(this,"Creater of this Time Pass..!!",Toast.LENGTH_SHORT).show();
    }
}
