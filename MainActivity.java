package com.example.admin.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText pass;
    private TextView info;
    private Button login;
    private int counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.etname);
        pass =(EditText)findViewById(R.id.etpass);
        info =(TextView) findViewById(R.id.text);
        login =(Button)findViewById(R.id.btn);
        info.setText("no of attemps remananing is 5");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Validate(name.getText().toString(),pass.getText().toString());
            }
        });
    }
        private void Validate(String username,String password){
        if((username.equals("bhagavan")) && (password.equals("1234"))){
            Intent i =new Intent(MainActivity.this,Question.class);
            startActivity(i);
            }else{
            counter--;
            info.setText("no of attempts remanining"+ String.valueOf(counter));
            if(counter==0){
                login.setEnabled(false);
            }

        }
        }
}
