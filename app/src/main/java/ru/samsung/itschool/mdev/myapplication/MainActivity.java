package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn, btn2;
    public static final String KEY2 = "ttt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {
            // неявное намерение
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String url = "https://mirea.ru";
            intent.setData(Uri.parse(url));
            startActivity(intent);

        } else {
            // вызов 2-ой Активности - явное намерение
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra(KEY2, "Hello from MainActivity!");
            startActivity(intent);

        }

    }
}