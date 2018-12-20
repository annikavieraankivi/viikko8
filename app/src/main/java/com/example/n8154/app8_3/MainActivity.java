package com.example.n8154.app8_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SeekBar seek;
    TextView text, text2;
    EditText edit;
    BottleDispenser automaatti1;
    double amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        automaatti1 = new BottleDispenser();
        text = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textSeekBar);
        seekbar();


    }


    public void seekbar() {
        seek = (SeekBar) findViewById(R.id.seekBar);

        seek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    float progressvalue;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        progressvalue = progress;
                        text2.setText("Valittuna "+progress/10 + "e");
                        Toast.makeText(MainActivity.this, "Valitse syötettävä rahamäärä", Toast.LENGTH_LONG).show();
                        amount = progress/10;
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(MainActivity.this, "Paina nappia", Toast.LENGTH_LONG).show();

                    }
                }
        );

    }

    public void takeButtonClicked(View v) {
        automaatti1.returnMoney(text);
    }

    public void BuyButtonClicked(View v) {
        automaatti1.buyBottle(text);
    }

    public void addButtonClicked(View v) {
        automaatti1.addMoney(text, amount);
        seek.setProgress(0);
    }
}

