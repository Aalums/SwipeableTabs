package com.example.lab203_05.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), " ต้ม - แกง ");
        adapter.addFragment(new Tab2Fragment(), " ผัด - ทอด ");
        adapter.addFragment(new Tab2Fragment(), " อบ - ตุ๋น ");
        adapter.addFragment(new Tab3Fragment(), " ปิ้ง - ย่าง ");
        adapter.addFragment(new Tab1Fragment(), " อาหารจานเดียว");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
