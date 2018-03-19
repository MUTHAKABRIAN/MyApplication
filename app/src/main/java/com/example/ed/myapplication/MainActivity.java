package com.example.ed.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int numberOfCoffee = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment (View view) {
        numberOfCoffee=numberOfCoffee+1;
        displayQuantity(numberOfCoffee);
    }
    public void decrement(View view) {
        numberOfCoffee=numberOfCoffee-1;
        displayQuantity(numberOfCoffee);
    }
        public void submitOrder (View view){
            displayPrice(numberOfCoffee*5);

    }
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    public void displayPrice(int number){
            TextView priceTextView=(TextView) findViewById(R.id.price_text_view);
            priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}