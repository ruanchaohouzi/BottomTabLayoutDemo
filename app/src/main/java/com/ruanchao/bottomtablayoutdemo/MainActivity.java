package com.ruanchao.bottomtablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ruanchao.bottomtablayout.view.BottomTabLayoutView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomTabLayoutView mBottomTabLayoutView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomTabLayoutView = findViewById(R.id.tab_layout);

        List<Fragment> fragments = new ArrayList<>();
        Page1 page1 = new Page1();
        Bundle bundle1 = new Bundle();
        bundle1.putString("page","页面11111");
        page1.setArguments(bundle1);
        fragments.add(page1);

        Page1 page2 = new Page1();
        Bundle bundle2 = new Bundle();
        bundle2.putString("page","页面2222");
        page2.setArguments(bundle2);
        fragments.add(page2);

        Page1 page3 = new Page1();
        Bundle bundle3 = new Bundle();
        bundle3.putString("page","页面3333");
        page3.setArguments(bundle3);
        fragments.add(page3);

        Page1 page4 = new Page1();
        Bundle bundle4 = new Bundle();
        bundle4.putString("page","页面4444");
        page4.setArguments(bundle4);
        fragments.add(page4);

        Page1 page5 = new Page1();
        Bundle bundle5 = new Bundle();
        bundle5.putString("page","页面55555");
        page5.setArguments(bundle5);
        fragments.add(page5);

        mBottomTabLayoutView.initView(getSupportFragmentManager(),fragments);
    }
}
