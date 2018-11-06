package com.example.admin.logindemo;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Question  extends AppCompatActivity {
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Title");
        menu.add("view");
        return super.onCreateOptionsMenu(menu);
    }
    Button btn;
    Button btn1;
    ImageView img;
    private static final int CAMERA_REQUEST=500;
    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_question);
        img = (ImageView) this.findViewById(R.id.img);
        btn = (Button) this.findViewById(R.id.btn);
         btn1 = (Button) this.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Question.this, QuestionPage.class);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent cam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cam, CAMERA_REQUEST);
            }
        });
    }

        protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if(requestCode==CAMERA_REQUEST &&resultCode== Activity.RESULT_OK){

            Bitmap photo =(Bitmap)data.getExtras().get("data");
            img.setImageBitmap(photo);
        }
    }

}
