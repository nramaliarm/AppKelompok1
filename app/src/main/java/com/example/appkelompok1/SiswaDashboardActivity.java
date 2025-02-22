package com.example.appkelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SiswaDashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa_dashboard);

        TextView txtNamaSiswa = findViewById(R.id.tv_greeting);
        Button btnDaftarSekolah = findViewById(R.id.btnDaftar);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set nama siswa
        txtNamaSiswa.setText("Halo, Syahril Ramadhan!");

        // Tombol daftar sekolah
        btnDaftarSekolah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SiswaDashboardActivity.this, FormPendaftaranActivity.class);
                startActivity(intent);
            }
        });

        // Event listener untuk Bottom Navigation
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_school) {
                    // Jika tombol "School" diklik, pindah ke Activity School
                    Intent intent = new Intent(SiswaDashboardActivity.this, SchoolActivity.class);
                    startActivity(intent);
                    return true;
                }
                return false;
            }
        });
    }
}
