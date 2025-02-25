package com.example.appkelompok1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SiswaDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa_dashboard);

        // Inisialisasi BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set default fragment saat pertama kali dibuka
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new SiswaDashboardFragment()).commit();

        // Set listener untuk item bottom navigation
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            // Tentukan fragment berdasarkan item yang dipilih
            if (item.getItemId() == R.id.home) {
                selectedFragment = new SiswaDashboardFragment();
            } else if (item.getItemId() == R.id.school) {
                selectedFragment = new SchoolFragment();
            } else if (item.getItemId() == R.id.formulir) {
                selectedFragment = new FormulirFragment();
            } else if (item.getItemId() == R.id.akun) {
                selectedFragment = new AkunFragment();
            }

            // Ganti fragment yang dipilih
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment).commit();

            return true;
        });
    }
}
