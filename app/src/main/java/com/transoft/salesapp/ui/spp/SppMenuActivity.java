package com.transoft.salesapp.ui.spp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.transoft.salesapp.R;
import com.transoft.salesapp.utils.AndroidUtil;

public class SppMenuActivity extends AppCompatActivity {

    private CardView cardPickUp;
    private CardView cardDelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spp_menu);
        initialize();
        setupWidgets();
    }

    private void initialize() {
        cardPickUp = findViewById(R.id.card_pick_up);
        cardDelivery = findViewById(R.id.card_delivery);
    }

    private void setupWidgets() {
        Window window = getWindow();
        AndroidUtil.statusBarColorTransparentWithKeyboard(this, window);
        cardPickUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PickUpListActivity.class));
            }
        });
        cardDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("CLICK DELIVERY...");
            }
        });
    }
}
