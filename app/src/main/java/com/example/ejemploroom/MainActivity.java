package com.example.ejemploroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RoomDB db;
    List<Auto> datalist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializar base de datos
        db = RoomDB.getInstance(this);
        db.mainDao().insert(new Auto(1,"algo","2","3"));
        //sotre database value in data list
        datalist = db.mainDao().getAll();
        Auto aux = datalist.get(0);
        for (:
             ) {
            
        }
        Log.d("TAG", "onCreate: "+ aux.getModelo() +", " + aux.getColor());
    }
}