package com.example.shijun.guidepagemanage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (GuidePageManager.hasNotShowed(this, MainActivity.class.getSimpleName())){
            new GuidePage.Builder(this)
                         .setLayoutId(R.layout.view_home_guide_page)
                         .setKnowViewId(R.id.btn_home_act_enter_know)
                         .setPageTag(MainActivity.class.getSimpleName())
                         .builder()
                         .apply();
        }
    }
}
