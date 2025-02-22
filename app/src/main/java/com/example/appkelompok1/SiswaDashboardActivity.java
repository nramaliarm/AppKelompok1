package com.example.appkelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SiswaDashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa_dashboard);

        TextView txtNamaSiswa = findViewById(R.id.txtNamaSiswa);
        Button btnDaftarSekolah = findViewById(R.id.btnDaftarSekolah);

        // Contoh pengaturan nama siswa (Bisa diambil dari database)
        txtNamaSiswa.setText("Halo, Syahril Ramadhan!");

        btnDaftarSekolah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke halaman pendaftaran
                Intent intent = new Intent(SiswaDashboardActivity.this,  FormPendaftaranActivity.class);
                startActivity(intent);
            }
        });
    }
}
