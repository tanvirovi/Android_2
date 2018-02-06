package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        //tv = (TextView) findViewById(R.id.myText);
        //int num = Integer.valueOf(tv.getText().toString());
        int price = count * 5;
        String msgToShow = "Total coffee ordered " + count + " and the price is " + NumberFormat.getCurrencyInstance().format(price);
        displayPrice(msgToShow);
    }

    public void addToQuantity(View view) {
        display(1);
    }

    public void removeFromQuantity(View view) {
        display(2);
    }

    private void displayPrice(String msg) {
        TextView priceTextView = (TextView) findViewById(R.id.myText_2);
        priceTextView.setText(msg);
    }

    private void display(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.myText);
        if (number == 2) {
            if (count == 0){
                quantityTextView.setText("0");
            }else {
                System.out.println("before " + count);
                count--;
                quantityTextView.setText("" + count);
            }
        } else {
            count++;
            quantityTextView.setText("" + count);
        }

    }
}
