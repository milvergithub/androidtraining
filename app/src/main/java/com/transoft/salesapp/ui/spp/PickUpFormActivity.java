package com.transoft.salesapp.ui.spp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.transoft.salesapp.R;
import com.transoft.salesapp.utils.AndroidUtil;

public class PickUpFormActivity extends AppCompatActivity {

    private Button btnSave, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up_form);
        initialize();
        setupWidgets();
    }

    private void initialize() {
        btnSave = findViewById(R.id.btn_pu_save);
        btnCancel = findViewById(R.id.btn_pu_cancel);
    }

    private void setupWidgets() {
        Window window = getWindow();
        AndroidUtil.statusBarColorTransparentWithKeyboard(this, window);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PickUpListActivity.class));
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PickUpListActivity.class));
            }
        });
    }
}
