package com.mobilemovement.databindinginterface;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.android.databinding.library.baseAdapters.BR;
import com.mobilemovement.databindinginterface.callback.IViewTouchListener;
import com.mobilemovement.databindinginterface.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mActivityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        init();

        SampleClazz.displayText(mActivityMainBinding, new IViewTouchListener() {
            @Override
            public void onTouched(String text) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
            }
        });

    }

    private void init() {
        mActivityMainBinding.setVariable(BR.demoText, "Demo Text");
        mActivityMainBinding.executePendingBindings();
    }
}