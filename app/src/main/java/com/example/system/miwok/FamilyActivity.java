package com.example.system.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        // Created an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "әpә"));
        words.add(new Word("Mother", "әṭa"));
        words.add(new Word("Son", "angsi"));
        words.add(new Word("Daughter", "tune"));
        words.add(new Word("Older brother", "taachi"));
        words.add(new Word("Younger brother", "chalitti"));
        words.add(new Word("Older sister", "teṭe"));
        words.add(new Word("Younger sister", "kolliti"));
        words.add(new Word("Grandmother ", "ama"));
        words.add(new Word("Grandfather", "paapa"));
        // Find the root view so we can add child views to it
        //for loop to do the same task as that of while loop
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
