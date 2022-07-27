package com.meli.cruddatamahasiswa;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLietHelper extends SQLiteOpenHelper {
    private static final String namadb = "akademik.db";
    private static final String namatabel = "mahasiswa";

    private static final String kolom1 = "ID";
    private static final String kolom2 = "NAMA";
    private static final String kolom3 = "NIM";
    private static final String kolom4 = "JURUSAN";
    private static final String kolom5 = "ALAMAT";

    public SQLietHelper(@Nullable Context context) {
        super(context, namadb, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + namatabel + "(" +
                kolom1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                kolom2 + " TEXT, " +
                kolom3 + " TEXT, " +
                kolom4 + " TEXT, " +
                kolom5 + " TEXT " +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + namatabel);
    }

    public Boolean insertData(String NAMA, String NIM, String JURUSAN, String ALAMAT) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(kolom2, NAMA);
        values.put(kolom3, NIM);
        values.put(kolom4, JURUSAN);
        values.put(kolom5, ALAMAT);
        long result = db.insert(namatabel, null, values);
        return result != -1;
    }

    public Cursor getDataAll(){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.rawQuery("SELECT * FROM " + namatabel, null);
    }

    public boolean updateData(String ID, String NAMA, String NIM, String JURURSAN, String ALAMAT){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(kolom1,ID);
        values.put(kolom2,NAMA);
        values.put(kolom3,NIM);
        values.put(kolom4,JURURSAN);
        values.put(kolom5,ALAMAT);
        db.update(namatabel,values,kolom1+" = ? ",new String[]{ID});
        return true;
    }

    public Integer deleteData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(namatabel,kolom1+" ? ",new String[]{id});
    }
}
