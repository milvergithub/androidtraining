package com.transoft.salesapp.activity.pickup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.transoft.salesapp.R;
import com.transoft.salesapp.adapter.PickUpAdapter;
import com.transoft.salesapp.model.PickUp;

public class PickUpActivity extends AppCompatActivity implements PickUpAdapter.OnPickUpClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up);
        initComponents();
        setupWidgets();
        setupBottomNavigationView();
    }

    private void initComponents() {

    }

    private void setupWidgets() {

    }

    private void setupBottomNavigationView() {
        BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.navigation_reception, R.id.navigation_dashboard, R.id.navigation_notifications).build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

    @Override
    public void onPickUpClickListener(PickUp pickUp) {
        System.out.println("aaaaaaaaaaaaaaaaaa");
    }

    @Override
    public void onPickUpFavoriteClick(PickUp pickUp) {
        System.out.println("bbbbbbbbbbbbbbbbbb");
    }
}
