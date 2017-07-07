package com.example.yixiaoluo.android_0706;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

/**
 * Created by yixiaoluo on 2017/7/7.
 */

public class FragmentsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        this.setFragments();
    }

    private void setFragments(){
        Log.i(this.getClass().getName(), "setFragments");
    }
}
