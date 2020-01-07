package com.transoft.salesapp.activity.spp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.transoft.salesapp.R;
import com.transoft.salesapp.utils.AndroidUtil;

public class PickUpFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up_form);
        initialize();
        setupWidgets();
    }

    private void initialize() {

    }

    private void setupWidgets() {
        Window window = getWindow();
        AndroidUtil.statusBarColorTransparentWithKeyboard(this, window);
    }
}
