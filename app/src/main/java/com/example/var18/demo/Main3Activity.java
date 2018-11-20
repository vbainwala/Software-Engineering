package com.example.var18.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    EditText txt;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //txt= (EditText)findViewById(R.id.textBox1);
        //btn1=(Button)findViewById(R.id.button);

        //   String abc;

        // btn1.setOnClickListener(new View.OnClickListener() {
        //   @Override
        //  public void onClick(View v) {

        //     abc= txt.getText().toString();
        //     }
        //});

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // API 5+ solution
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Main3Activity.this,Main2Activity.class);
        startActivity(intent);
        super.onBackPressed();
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
