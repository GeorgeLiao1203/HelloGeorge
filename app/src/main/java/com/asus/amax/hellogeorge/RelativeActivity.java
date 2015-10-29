package com.asus.amax.hellogeorge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        ListView listView = (ListView) findViewById(R.id.hello_listview);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("George");
        arrayList.add("Andrew");
        arrayList.add("Eaway");
        arrayList.add("George");
        arrayList.add("Andrew");
        arrayList.add("Eaway");
        arrayList.add("George");
        arrayList.add("Andrew");
        arrayList.add("Eaway");
        arrayList.add("George");
        arrayList.add("Andrew");
        arrayList.add("Eaway");
        arrayList.add("George");
        arrayList.add("Andrew");
        arrayList.add("Eaway");
        //利用字串陣列製作 Adapter ，顯示樣式為 android.R.layout.simple_list_item_1。
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                RelativeActivity.this,
                android.R.layout.simple_list_item_1, arrayList);
        //將 Adapter 放進元件中，設定資料來源。
        listView.setAdapter(adapter);
    }
}
