package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String getvalue = bundle.getString(MainActivity.KEY2);
            Snackbar.make(findViewById(R.id.root2),getvalue,Snackbar.LENGTH_LONG).show();
            Toast.makeText(this,getvalue,Toast.LENGTH_LONG).show();
        }

    }
}