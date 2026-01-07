package com.example.petshop;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pet pet1 = new Pet("Buddy");
        Pet pet2 = new Pet("Luna", new java.util.Date());
    }
}
