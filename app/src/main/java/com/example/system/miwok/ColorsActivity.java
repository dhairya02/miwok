package com.example.system.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        // Created an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "Weṭeṭṭi"));
        words.add(new Word("Mustard yellow", "Chiwiiṭә"));
        words.add(new Word("Dusty yellow", "Topiisә"));
        words.add(new Word("Green", "Chokokki"));
        words.add(new Word("Brown", "Takaakki"));
        words.add(new Word("Gray", "Topoppi"));
        words.add(new Word("Black", "Kululli"));
        words.add(new Word("White", "Kelelli"));
        // Find the root view so we can add child views to it
        //for loop to do the same task as that of while loop
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
