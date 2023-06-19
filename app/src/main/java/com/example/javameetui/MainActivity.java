package com.example.javameetui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private int value=0;
       private Button btnAdd,btnHide,btnGrow,btnTake,btnShrink, btnReset;
       private TextView txtValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnADD);
        btnGrow = findViewById(R.id.btnGrow);
        btnHide = findViewById(R.id.btnHide);
        btnReset = findViewById(R.id.btnReset);
        btnTake = findViewById(R.id.btnTake);
        btnShrink = findViewById(R.id.btnShrink);
        txtValue = findViewById(R.id.txtValue);

        btnAdd.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
        btnHide.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        btnTake.setOnClickListener(this);
        btnShrink.setOnClickListener(this);
        txtValue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float size= 0;

        switch (v.getId()){
            case R.id.btnADD:
                value++;
                txtValue.setText(""+value);
                break;
            case R.id.btnTake:
                value--;
                txtValue.setText(""+value);
                break;
            case R.id.btnReset:
                value=0;
                txtValue.setText(""+0);
                break;
            case R.id.btnGrow:
                size=txtValue.getTextScaleX();
                txtValue.setTextScaleX(size+1);
                break;
            case R.id.btnShrink:
                size=txtValue.getTextScaleX();
                txtValue.setTextScaleX(size-1);
                break;
            case R.id.btnHide:
                if((txtValue.getVisibility())==View.VISIBLE){
                    txtValue.setVisibility(View.GONE);
                    btnHide.setText("SHOW");
                }else{
                    txtValue.setVisibility(View.VISIBLE);
                    btnHide.setText("HIDE");
                }
                break;
        }

    }
}