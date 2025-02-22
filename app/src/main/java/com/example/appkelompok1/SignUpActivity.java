package com.example.appkelompok1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText inputEmail = findViewById(R.id.inputEmail);
        EditText inputNama = findViewById(R.id.inputNama);
        EditText inputPassword = findViewById(R.id.inputPassword);
        Button btnSignUp = findViewById(R.id.btnSignUp);
        TextView btnLogin = findViewById(R.id.btnLogin);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString();
                String nama = inputNama.getText().toString();
                String password = inputPassword.getText().toString();

                if (email.isEmpty() || nama.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Harap isi semua kolom!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SignUpActivity.this, "Pendaftaran Berhasil!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUpActivity.this, LoginSiswaActivity.class);
                    startActivity(intent);
                }
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginSiswaActivity.class);
                startActivity(intent);
            }
        });
    }
}
