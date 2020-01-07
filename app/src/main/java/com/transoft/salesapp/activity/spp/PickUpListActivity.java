package com.transoft.salesapp.activity.spp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.transoft.salesapp.R;
import com.transoft.salesapp.adapter.PickUpAdapter;
import com.transoft.salesapp.model.PickUp;

public class PickUpListActivity extends AppCompatActivity implements PickUpAdapter.OnPickUpClickListener {

    private RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up_list);
        initialize();
        setupWidgets();
    }

    private void initialize() {
        list = findViewById(R.id.recycler_view);
    }

    private void setupWidgets() {
        LinearLayoutManager llmPlace = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        list.setLayoutManager(llmPlace);
        PickUpAdapter receptionAdapter = new PickUpAdapter(this);
        list.setAdapter(receptionAdapter);
    }

    @Override
    public void onPickUpClickListener(PickUp pickUp) {

    }

    @Override
    public void onPickUpFavoriteClick(PickUp pickUp) {

    }
}
