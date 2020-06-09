package com.example.mytrip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PlaceList extends AppCompatActivity {

    private ListView listview;
    private MyAdapter adapter;
    private int[] img = {R.drawable.busan_1, R.drawable.ic_location, R.drawable.ic_location};
    private String [] Title = {"해운대 해수욕장", "관광지", "관광지"};
    private String [] Context = {"해운대 해수욕장에 대한 한줄 설명", "관광지 한 줄 설명", "관광지 한 줄 설명"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_list);

        adapter = new MyAdapter();
        listview = (ListView) findViewById(R.id.listView);

        listview.setAdapter(adapter);

        for (int i = 0 ; i < img.length ; i++){
            adapter.addItem(ContextCompat.getDrawable(this, img[i]), Title[i], Context[i]);
        }

    }



}
