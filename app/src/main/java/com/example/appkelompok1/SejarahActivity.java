package com.example.appkelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SejarahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah); // Pastikan layout sesuai dengan XML Anda

        // Menambahkan listener untuk tombol Sejarah
        Button btnSejarah = findViewById(R.id.btn_sejarah);
        btnSejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Sejarah
                Intent intent = new Intent(SejarahActivity.this, SejarahActivity.class);
                startActivity(intent);
            }
        });

        // Menambahkan listener untuk tombol Tujuan
        Button btnTujuan = findViewById(R.id.btn_tujuan);
        btnTujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Tujuan
                Intent intent = new Intent(SejarahActivity.this, TujuanActivity.class);
                startActivity(intent);
            }
        });

        // Menambahkan listener untuk tombol Visi Misi
        Button btnVisiMisi = findViewById(R.id.btn_visi_misi);
        btnVisiMisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Visi Misi
                Intent intent = new Intent(SejarahActivity.this, VisiMisiActivity.class);
                startActivity(intent);
            }
        });

        // Menambahkan listener untuk tombol Sarana dan Prasarana
        Button btnSaranaPrasarana = findViewById(R.id.btn_sarana);
        btnSaranaPrasarana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Sarana dan Prasarana
                Intent intent = new Intent(SejarahActivity.this, SaranaActivity.class);
                startActivity(intent);
            }
        });

        // Menambahkan listener untuk tombol Ekstrakurikuler
        Button btnEkstrakurikuler = findViewById(R.id.btn_ekskul);
        btnEkstrakurikuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman Ekstrakurikuler
                Intent intent = new Intent(SejarahActivity.this, EkstrakurikulerActivity.class);
                startActivity(intent);
            }
        });
    }
}
