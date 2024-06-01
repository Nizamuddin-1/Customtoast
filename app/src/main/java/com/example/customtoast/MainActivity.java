package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(MainActivity.this);
                View v = getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.view));
                toast.setView(v);
                TextView t = v.findViewById(R.id.txt);
                ImageView a = v.findViewById(R.id.ima);
                t.setText("Message sent successfully");
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();

            }
        });
        //Toast.makeText(this, "This is My first Toast", Toast.LENGTH_SHORT).show();


    }
}