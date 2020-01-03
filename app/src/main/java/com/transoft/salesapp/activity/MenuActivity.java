package com.transoft.salesapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.transoft.salesapp.R;
import com.transoft.salesapp.activity.SppActivity.SppActivity;
import com.transoft.salesapp.utils.AndroidUtil;

public class MenuActivity extends AppCompatActivity {

    private Button btnSales, btnSpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initialize();
        setupWidgets();
    }

    private void initialize() {
        btnSales = findViewById(R.id.btn_sales);
        btnSpp = findViewById(R.id.btn_spp);
    }

    private void setupWidgets() {
        Window window = getWindow();
        AndroidUtil.statusBarColorTransparentWithKeyboard(this, window);
        btnSales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Scanner.class));
            }
        });
        btnSpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SppActivity.class));
            }
        });
    }
}
