package com.example.ali.mealdealtycoon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MealDealTycoon extends AppCompatActivity {


    ViewFlipper flippy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_deal_tycoon);

    }

    public void textEntryOnClick(View v){
        TextView txt;
        txt = (TextView)findViewById(R.id.txtName);
        txt.setText("");
    }

    public void ButtonOnClick(View v){
        TextView txt;
        txt = (TextView)findViewById(R.id.txtName);
        startGame(txt.getText().toString());
    }

    private void startGame(String name){
        Company player = new Company(name);
        flippy = (ViewFlipper) findViewById(R.id.viewFlipper);
        flippy.showNext();

    }


}