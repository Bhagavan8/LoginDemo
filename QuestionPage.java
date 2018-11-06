package com.example.admin.logindemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;


public class QuestionPage extends AppCompatActivity {
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Title");
        menu.add("about");
        menu.add("questions more");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);
    }
}

