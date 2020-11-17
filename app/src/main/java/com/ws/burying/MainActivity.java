package com.ws.burying;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ws.myburyinglibrary.BuryingDBUtils;

import org.xutils.ex.DbException;

public class MainActivity extends AppCompatActivity {

    private TextView mTv;
    private TextView mTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mTv = (TextView) findViewById(R.id.tv);
        mTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    BuryingDBUtils.addBurying("123", 123, 12312, "1123", "123");
                } catch (DbException e) {
                    e.printStackTrace();
                }
            }
        });
        mTv1 = (TextView) findViewById(R.id.tv1);
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("BuryingDBUtils", BuryingDBUtils.selet().toString());
            }
        });
    }
}