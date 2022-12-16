package com.example.pemmobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pemmobile.Adapter.Adapter_Barang;
import com.example.pemmobile.Model.m_barang;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class Barang extends AppCompatActivity {
    RecyclerView lvBarang;
    ArrayList<m_barang> data;
    Adapter_Barang adp;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);

        lvBarang = findViewById(R.id.lvBarang);

        dataBarang();

    }

    public void dataBarang(){
     data = new ArrayList<>();

        ProgressDialog p = new ProgressDialog(this);
        p.setTitle("Loading....");
        p.setMessage("Bentar cokk...");
     db.collection("barang").get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
         @Override
         public void onComplete(@NonNull Task<QuerySnapshot> task) {
             if (task.isSuccessful()) {
                 for (QueryDocumentSnapshot document : task.getResult()) {
                     int i = (int)  document.getData().get("harga");
                    data.add(new m_barang(
                        document.getId().toString(),
                        document.getData().get("nama_barang").toString(), R.drawable.ic_bike,
                                    document.getData().get("satuan").toString(),
                                    i)
                    );
                     }
                 }
              else {

             }
         }
     });
    }

}