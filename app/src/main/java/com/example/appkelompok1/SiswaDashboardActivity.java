package com.example.appkelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class SiswaDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa_dashboard);
    }

    // Inisialisasi BottomNavigationView
    BottomNavigationItemView bottomNavigationView = findViewById(R.id.bottom_navigation);

   (R.id.fragment_container, new SiswaDashboardFragment()).commit();

        bottomNavigationView.setOn(item -> {Fragment selectedFragment = null;

        if (item.getItemId() == R.id.home) {
            selectedFragment = new SiswaDashboardFragment();
        } else if (item.getItemId() == R.id.school) {
            selectedFragment = new SchoolFragment();
        } else if (item.getItemId() == R.id.formulir) {
            selectedFragment = new FormulirFragment();
        } else if (item.getItemId() == R.id.akun) {
            selectedFragment = new AkunFragment();
        }

        // Ganti fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, selectedFragment).commit();

        return true;
    });
}
