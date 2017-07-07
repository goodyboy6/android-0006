package com.example.yixiaoluo.android_0706;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick1(View v){
        if (v.getId() == R.id.button1){
            Toast.makeText(this, R.string.dialog_message, Toast.LENGTH_SHORT).show();

            //页面跳转传参
            Intent i = new Intent(this, Bundle.class);

            Bundle b = new Bundle();
            b.putString("gloableId", "");
            i.putExtra("bundle", b);

            i.setClass(this, DetailActivity.class);
            startActivityForResult(i, 100);
        }
    }

    public void gotoMultiFragmentsActivity(View v){
        //页面跳转传参
        Intent i = new Intent(this, Bundle.class);

        Bundle b = new Bundle();
        b.putString("gloableId", "");
        i.putExtra("bundle", b);

        i.setClass(this, FragmentsActivity.class);
        startActivityForResult(i, 101);
    }

    //页面数据回调
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == 100){
            EditText t = (EditText)this.findViewById(R.id.return_value);
            Bundle b =  (Bundle) data.getExtras();
            String text = (String) b.get("textValue");
            t.setText(text);
        }
    }
}
