package com.example.appkelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        // Tombol untuk Sejarah
        Button btnSejarah = findViewById(R.id.btn_sejarah);
        btnSejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Sejarah
                Intent intent = new Intent(SchoolActivity.this, SejarahActivity.class);
                startActivity(intent);
            }
        });

        // Tombol untuk Tujuan
        Button btnTujuan = findViewById(R.id.btn_tujuan);
        btnTujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Tujuan
                Intent intent = new Intent(SchoolActivity.this, TujuanActivity.class);
                startActivity(intent);
            }
        });

        // Tombol untuk Visi Misi
        Button btnVisiMisi = findViewById(R.id.btn_visi_misi);
        btnVisiMisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Visi Misi
                Intent intent = new Intent(SchoolActivity.this, VisiMisiActivity.class);
                startActivity(intent);
            }
        });

        // Tombol untuk Sarana Prasarana
        Button btnSaranaPrasarana = findViewById(R.id.btn_sarana);
        btnSaranaPrasarana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Sarana Prasarana
                Intent intent = new Intent(SchoolActivity.this, SaranaActivity.class);
                startActivity(intent);
            }
        });

        // Tombol untuk Ekstrakurikuler
        Button btnEkstrakurikuler = findViewById(R.id.btn_ekskul);
        btnEkstrakurikuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Ekstrakurikuler
                Intent intent = new Intent(SchoolActivity.this, EkstrakurikulerActivity.class);
                startActivity(intent);
            }
        });
    }
}
