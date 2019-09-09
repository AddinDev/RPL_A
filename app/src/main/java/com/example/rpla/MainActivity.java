package com.example.rpla;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.DragStartHelper;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //Attribute, Variable, Field

    //Access Modifier -- Nama Class -- nama object / nama variable
    private EditText etPanjang, etLebar, etTinggi;
    private Button btnHitung;
    private TextView tvHasil;

    //Method / Function

    //Syntax Error

    //Logic Error

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("ASP",MainActivity.class.getSimpleName()+" onCreate");

        //Binding View
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btnHitung = findViewById(R.id.btnHitung);
        tvHasil = findViewById(R.id.tvHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer panjang = Integer.parseInt(etPanjang.getText().toString());
                Integer lebar = Integer.parseInt(etLebar.getText().toString());
                Integer tinggi = Integer.parseInt(etTinggi.getText().toString());

                tvHasil.setText(String.valueOf(panjang*lebar*tinggi));

                MyBiodata bioadataAddin = new MyBiodata("Addin", 15);

                Intent keActivityDua = new Intent(MainActivity.this,ActivityDua.class);


            }
        });


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ASP",MainActivity.class.getSimpleName()+" onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ASP",MainActivity.class.getSimpleName()+" onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ASP",MainActivity.class.getSimpleName()+" onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ASP",MainActivity.class.getSimpleName()+" onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ASP",MainActivity.class.getSimpleName()+" onDestroy");
    }


}
