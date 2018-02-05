package com.example.exam2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CoffeeActivity extends AppCompatActivity {

    public static final int MIN_QUANTITY = 1;
    public static final int DEFAULT_QUANTITY = 1;
    public static final int COFFEE_PRICE = 3000;
    private TextView mQuantityTextView;
    private TextView mPriceTextView;
    private int mQuantity = DEFAULT_QUANTITY;

    private DecimalFormat mFormat = new DecimalFormat("#,##0");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //레이아웃 설정
        setContentView(R.layout.activity_coffee);

        // XML에 있는 view의 레퍼런스를 가져오는 방법
        mQuantityTextView = (TextView) findViewById(R.id.quantity_text);
        mPriceTextView = (TextView) findViewById(R.id.price_text);
        Button plusButton = (Button) findViewById(R.id.plus_button);
        Button minesButton = (Button) findViewById(R.id.minus_button);

        display();
    }

    private void display() {
        mQuantityTextView.setText("" + mQuantity);
        mQuantityTextView.setText(mFormat.format(mQuantity * COFFEE_PRICE + "원"));
    }

    public void minusButtonClicked(View view) {
        mQuantity--;
        if (mQuantity < MIN_QUANTITY) {
            mQuantity = MIN_QUANTITY;}
        display();
    }

    public void plusButtonClicked(View view) {
        mQuantity++;
        display();
    }
}