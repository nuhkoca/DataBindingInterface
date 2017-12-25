package com.mobilemovement.databindinginterface;

import com.android.databinding.library.baseAdapters.BR;
import com.mobilemovement.databindinginterface.callback.IViewTouchListener;
import com.mobilemovement.databindinginterface.databinding.ActivityMainBinding;

public class SampleClazz {
    public static void displayText(ActivityMainBinding activityMainBinding, IViewTouchListener iViewTouchListener){
        activityMainBinding.setVariable(BR.touchListener, iViewTouchListener);
        activityMainBinding.executePendingBindings();
        iViewTouchListener.onTouched("Demo text");
    }
}