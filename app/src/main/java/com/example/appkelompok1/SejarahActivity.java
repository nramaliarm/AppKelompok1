package com.example.appkelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class SejarahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);  // Pastikan layout sesuai dengan XML Anda
    }

    // Method untuk navigasi ke Home
    public void navigateToHome(View view) {
        Intent intent = new Intent(SejarahActivity.this, SiswaDashboardActivity.class);
        startActivity(intent);
    }

    // Method untuk navigasi ke School
    public void navigateToSchool(View view) {
        Intent intent = new Intent(SejarahActivity.this, SchoolActivity.class);
        startActivity(intent);
    }

    // Method untuk navigasi ke Formulir
    public void navigateToFormulir(View view) {
        Intent intent = new Intent(SejarahActivity.this, FormPendaftaranActivity.class);
        startActivity(intent);
    }

    // Method untuk navigasi ke Profile
    public void navigateToProfile(View view) {
        Intent intent = new Intent(SejarahActivity.this, ProfileSiswaActivity.class);
        startActivity(intent);
    }
}
