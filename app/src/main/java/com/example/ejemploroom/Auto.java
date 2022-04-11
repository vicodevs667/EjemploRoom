package com.example.ejemploroom;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "auto")
public class Auto {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "modelo")
    @NonNull
    private String modelo;

    @ColumnInfo(name = "color")
    private String color;

    @ColumnInfo(name = "marca")
    private String marca;

    public Auto(int id, @NonNull String modelo, String color, String marca) {
        this.id = id;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    @NonNull
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }
}

