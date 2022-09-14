package com.example.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //private Button display;
    private CheckBox ch1, ch2, ch3, ch4, ch5;
    //7private ArrayList<String> checkNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //display = findViewById(R.id.button);
        ch1 = findViewById(R.id.checkBox1);
        ch2 = findViewById(R.id.checkBox2);
        ch3 = findViewById(R.id.checkBox3);
        ch4 = findViewById(R.id.checkBox4);
        ch5 = findViewById(R.id.checkBox5);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showToast(View view){
        String message = "";

        if(ch1.isChecked()){
            message = message + getString(R.string.chocolate_syrup) + " ";
        }
        if(ch2.isChecked()){
            //displayToast(getString(R.string.sprinkles));
            message = message + getString(R.string.sprinkles) + " ";
        }
        if(ch3.isChecked()){
            message = message + getString(R.string.crushed_nuts) + " ";
        }
        if(ch4.isChecked()){
            //displayToast(getString(R.string.cherries));
            message = message + getString(R.string.cherries) + " ";
        }
        if(ch5.isChecked()){
            //displayToast(getString(R.string.oreo_cookie));
            message = message + getString(R.string.oreo_cookie) + " ";
        }

        displayToast(message);

    }

}