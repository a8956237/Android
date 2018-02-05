package com.example.exam2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CoffeeActivity extends AppCompatActivity {

    private TextView mQuantityTextView;
    private TextView mPriceTextView;
    private int mQuantity = 1;

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

        mQuantityTextView.setText("" + mQuantity);
        mQuantityTextView.setText(mFormat.format(mQuantity * 3000 + "원"));
    }

    public void minusButtonClicked(View view) {
        mQuantity--;
        if (mQuantity < 1) {
            mQuantity = 1;}
        mQuantityTextView.setText("" + mQuantity);
        mPriceTextView.setText(mFormat.format(mQuantity * 3000 + "원"));
    }

    public void plusButtonClicked(View view) {
        mQuantity++;
        mQuantityTextView.setText("" + mQuantity);
        mPriceTextView.setText(mFormat.format(mQuantity * 3000 + "원"));
    }
}