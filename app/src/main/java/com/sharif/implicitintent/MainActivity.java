package com.sharif.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/Plain");
                intent.putExtra(Intent.EXTRA_EMAIL,"sharifk064@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT,"Testing Purpose");
                intent.putExtra(Intent.EXTRA_TEXT,"Welcome to our first email");
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                startActivity(intent);

            }
        });
    }
}