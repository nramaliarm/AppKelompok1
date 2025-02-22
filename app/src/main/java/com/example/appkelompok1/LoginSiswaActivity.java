package com.example.appkelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginSiswaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_siswa);

        EditText inputEmail = findViewById(R.id.inputEmail);
        EditText inputPassword = findViewById(R.id.inputPassword);
        Button btnLogin = findViewById(R.id.btnLogin);
        TextView btnDaftar = findViewById(R.id.btnDaftar);
        TextView txtLupaPassword = findViewById(R.id.txtLupaPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString();
                String password = inputPassword.getText().toString();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(LoginSiswaActivity.this, "Harap isi email dan password!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(LoginSiswaActivity.this, SiswaDashboardActivity.class);
                    startActivity(intent);
                }
            }
        });

        // Navigasi ke Halaman Sign Up
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSiswaActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        // Navigasi ke Halaman Lupa Password
        txtLupaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSiswaActivity.this, LupaPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
