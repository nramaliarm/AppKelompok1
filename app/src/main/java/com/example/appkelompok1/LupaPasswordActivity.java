package com.example.appkelompok1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LupaPasswordActivity extends AppCompatActivity {
    private EditText inputEmail;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        // Inisialisasi View
        inputEmail = findViewById(R.id.inputEmail);
        btnSubmit = findViewById(R.id.btnSubmit);
        ImageView btnBack = findViewById(R.id.btnBack);

        // Tombol Kembali
        btnBack.setOnClickListener(v -> finish());

        // Tombol Submit
        btnSubmit.setOnClickListener(v -> {
            String email = inputEmail.getText().toString().trim();
            if (email.isEmpty()) {
                Toast.makeText(LupaPasswordActivity.this, "Masukkan email atau nomor telepon!", Toast.LENGTH_SHORT).show();
            } else {
                // Simulasi pengiriman email reset password
                Toast.makeText(LupaPasswordActivity.this, "Instruksi reset password telah dikirim ke " + email, Toast.LENGTH_LONG).show();
            }
        });
    }
}
