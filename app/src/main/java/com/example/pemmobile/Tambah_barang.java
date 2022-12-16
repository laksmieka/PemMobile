package com.example.pemmobile;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.pemmobile.Adapter.Adapter_Barang;
import com.example.pemmobile.Model.m_barang;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class TambahBarang extends AppCompatActivity {
    RecyclerView lvBarang;
    ArrayList<m_barang> data;
    Adapter_Barang adp;
    FirebaseFirestore db;
    FloatingActionButton btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_barang);

        lvBarang = findViewById(R.id.lvBarang);
        btnAdd = findViewById(R.id.btnAdd);
        db = FirebaseFirestore.getInstance();
        btnAdd = findViewById(R.id.btnAdd);

        dataBarang();
        btnAdd.setOnClickListener(view -> {
            startActivity(new Intent(this, TambahBarang.class));
        } );

    }
    public void dataBarang() {
        data= new ArrayList<>()
    }
}