package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MainActivity binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =MainActivityBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);}
    public void digerActivity(View view){
        String adiSoyadi = binding.editTextTextKullaniciAdi.getText().toString();
        String telefonNo = binding.editTextTextSifre.getText().toString();
        Intent intent = new Intent(MainActivity.this,BilgiActivity.class);
        intent.putExtra("adiSoyadiKey",adiSoyadi);
        intent.putExtra("telefonNoKey",telefonNo);
        startActivity(intent);}
    }