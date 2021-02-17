package com.example.homework7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView websiteLV;

    String nameArray[] = {"NPR", "WikiNews", "Sputnik", "Reuters", "BBC",
            "Associate Press", "Google News", "AI Jazeera",
            "C-Span", "Christian Science Monitor", "Pew Research",
            "The Wall Street Journal"};

    String webArray[] = {"https://www.npr.org/sections/news/", "https://en.wikinews.org/wiki/Main_Page", "https://sputniknews.com/",
            "https://www.reuters.com/", "https://www.bbc.com/news", "https://www.apnews.com/",
            "https://news.google.com/?hl=en-US&gl=US&ceid=US:en", "https://www.aljazeera.com/", "https://www.c-span.org/",
            " https://www.csmonitor.com/", "http://www.pewresearch.org/", "https://www.wsj.com/"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //define global objects
        websiteLV = (ListView) findViewById(R.id.webLV);

        //define Array Adapter
        ArrayAdapter<String> pressAA = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, nameArray);

        //set the adapter to the ListView
        websiteLV.setAdapter(pressAA);


        //setting up listener to LV
        websiteLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                //create an Intent and attach the vars
                Intent gotoWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(webArray[position]));
                startActivity(gotoWeb);


            }

        });


    }
}
