package com.example.ejemploroom;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface MainDao {
    //insert QUERY
    @Insert(onConflict = REPLACE)
    void insert(Auto auto);

    //delete query
    @Delete
    void delete(Auto auto);

    //dellet all
    @Delete
    void reset(List<Auto> autos);

    //update
    @Query("UPDATE auto SET modelo = :sText WHERE id = :sID")
    void update(int sID, String sText);

    //get all data query
    @Query("SELECT * FROM auto")
    List<Auto> getAll();
}
