package com.example.constraintlayout_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Deklarasi variable untuk button
    Button btnLogin;

    // Deklarasi variable untuk Edit Text
    EditText edemail, edpassword;

    // Deklarsa variable untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menghubungkan variable btnLogin dengan componen button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        // Menghubungkan variable edemail dengan componen button pada Layout
        edemail=findViewById(R.id.edEmail);

        // Menghubungkan variable edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        // Membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Menyimpan input user di edittext email kedalam variable nama
                nama = edemail.getText().toString();

                // Menyimpan input user di edittext password kedalam variable password
                password = edpassword.getText().toString();

                // Membuat Kondisi validasi inputan User untuk Login
                if(nama.equals("admin@mail.com") && password.equals("hello")){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                }
                else if (nama.equals("admin@mail.com")){
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_SHORT).show();
                }
                else if(password.equals("hello")){
                    Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Email dan Password Salah", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}