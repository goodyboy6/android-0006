package com.example.yixiaoluo.android_0706;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by yixiaoluo on 2017/7/6.
 */

public class DetailActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String b = this.getIntent().getExtras().getBundle("bundle").getString("gloableId");

        EditText editText = (EditText) this.findViewById(R.id.editText);
        editText.setText(b);
    }

    public void doneButtonClicked(View v){
        Intent i = new Intent();

        EditText editText = (EditText) this.findViewById(R.id.editText);

        Bundle b = new Bundle();
        i.putExtra("textValue", editText.getText().toString());
        setResult(100, i);

        finish();
    }

}
