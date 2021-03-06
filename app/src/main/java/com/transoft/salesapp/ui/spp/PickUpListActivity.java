package com.transoft.salesapp.ui.spp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.transoft.salesapp.R;
import com.transoft.salesapp.adapter.PickUpAdapter;
import com.transoft.salesapp.model.PickUp;

import javax.inject.Inject;

public class PickUpListActivity extends AppCompatActivity implements PickUpAdapter.OnItemCardClickListener {

    private RecyclerView recyclerView;
    private FloatingActionButton addButton;

    @Inject
    public PickUpAdapter pickUpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up_list);
        initialize();
        setupWidgets();
    }

    private void initialize() {
        recyclerView = findViewById(R.id.recycler_view);
        addButton = findViewById(R.id.add_pick_up);
    }

    private void setupWidgets() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorAccentDark));
        }
        LinearLayoutManager llmPlace = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(llmPlace);
        recyclerView.setAdapter(pickUpAdapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PickUpFormActivity.class));
            }
        });
    }

    @Override
    public void onPickUpClickListener(PickUp pickUp) {
        System.out.println("Event : onPickUpClickListener");
    }
}
