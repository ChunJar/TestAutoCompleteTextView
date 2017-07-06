package com.example.cj.testautocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView auto;
    private ArrayAdapter<String> adapter;
    private String[] tips = {"a1", "a2", "a3", "b1", "c1", "aa1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        auto = (AutoCompleteTextView) findViewById(R.id.auto);
        adapter = new ArrayAdapter<String>(this, R.layout.adapter_item, tips);
        //设置适配器
        auto.setAdapter(adapter);
    }
}
