package com.example.appkelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // Ambil elemen UI yang ingin dianimasikan
        ImageView logo = findViewById(R.id.logo);
        TextView textTitle = findViewById(R.id.textTitle);

        // Load animasi fade-in (Pastikan file ini ada di res)
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        logo.startAnimation(fadeIn);
        textTitle.startAnimation(fadeIn);

        // Tunggu 3 detik, lalu pindah ke MainActivity dengan animasi
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish(); // Hapus StartActivity agar tidak bisa kembali ke sini
            }
        }, 3000); // 3 detik
    }
}
