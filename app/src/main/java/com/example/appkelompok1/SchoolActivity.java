package com.example.appkelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        // Inisialisasi Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set item yang dipilih
        bottomNavigationView.setSelectedItemId(R.id.nav_school);

        // Listener untuk navigasi antar halaman
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    startActivity(new Intent(getApplicationContext(), SiswaDashboardActivity.class));
                    overridePendingTransition(0, 0);
                    return true;

                case R.id.nav_school:
                    startActivity(new Intent(getApplicationContext(), SchoolActivity.class));
                    overridePendingTransition(0, 0);
                    return true;

                case R.id.nav_profile:
                    startActivity(new Intent(getApplicationContext(), ProfileSiswaActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
            }
            return false;
        });

        // Inisialisasi tombol menu profil sekolah
        Button btnSejarah = findViewById(R.id.btn_sejarah);
        Button btnTujuan = findViewById(R.id.btn_tujuan);
        Button btnVisiMisi = findViewById(R.id.btn_visi_misi);
        Button btnSarana = findViewById(R.id.btn_sarana);
        Button btnEkskul = findViewById(R.id.btn_ekskul);

        // Set OnClickListener untuk berpindah ke aktivitas yang sesuai
        btnSejarah.setOnClickListener(v -> openDetailPage(SejarahActivity.class));
        btnTujuan.setOnClickListener(v -> openDetailPage(TujuanActivity.class));
        btnVisiMisi.setOnClickListener(v -> openDetailPage(VisiMisiActivity.class));
        btnSarana.setOnClickListener(v -> openDetailPage(SaranaActivity.class));
        btnEkskul.setOnClickListener(v -> openDetailPage(EkstrakurikulerActivity.class));
    }

    // Fungsi untuk membuka halaman baru
    private void openDetailPage(Class<?> activityClass) {
        Intent intent = new Intent(SchoolActivity.this, activityClass);
        startActivity(intent);
    }
}
