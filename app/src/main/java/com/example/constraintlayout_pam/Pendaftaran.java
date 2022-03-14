package com.example.constraintlayout_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Pendaftaran extends AppCompatActivity {

    // Deklarasi variable dengan tipe data EditText
    EditText edtNama, edtAlamat,edtEmail,edtPassword,edtrepass;

    // Deklarassi variabel dengan tipe data floating action Button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.EdEmail);
        edtPassword = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edrepass);

        fab = findViewById(R.id.fabsimpan);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNama.getText().toString().isEmpty() || edtAlamat.getText().toString().isEmpty()
                || edtEmail.getText().toString().isEmpty() || edtPassword.getText().toString().isEmpty() ||
                edtrepass.getText().toString().isEmpty())
                {
                    // Menampilkan Pesa notifikasi jika seluruh EditText wajib diisi
                    Snackbar.make(view, "Wajib isi Seluruh Data !!!", Snackbar.LENGTH_SHORT).show();
                }
                else
                {
                    // membuat kondisi untuk mengecek apakah dari EditText password san EditText repassword
                    // Sama atau tidak
                    if(edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        // Menampilkan pesan notifikasi jika pendaftaran berhasil
                        Toast.makeText(getApplicationContext(), "Pendaftaraan Berhasil", Toast.LENGTH_SHORT).show();

                        // Method untuk kembali ke activity main
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else 
                    {
                        // Menampilkan pesam bahwa isi dari EditText password dan EditText repassword
                        // Tidak sama
                        Snackbar.make(view, "Password dan Repassword harus sama !!!", Snackbar.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}