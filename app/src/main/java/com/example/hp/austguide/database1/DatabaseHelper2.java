package com.example.hp.austguide.database1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.hp.austguide.Datavalue;

/**
 * Created by HP on 8/9/2017.
 */

public class DatabaseHelper2 extends SQLiteOpenHelper {

    private  static  final  String  DATABASE_NAME="infotable2";

    private  static  final  String  TABLE_NAME="infotable2";

    private  static  final  String  COL_ID="_id";
    private  static  final  String  COL_NAME="name";
    private  static  final  String  COL_NAME2="date";
    private static final String createTable = "CREATE TABLE " +TABLE_NAME+ " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +COL_NAME+"  VARCHAR(255),"+COL_NAME2+"  VARCHAR(255));";
    public  DatabaseHelper2(Context context)
    {
        super(context,DATABASE_NAME,null,1);
    }
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
  sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
onCreate(sqLiteDatabase);
    }
  public   void addingDataToTable(Datavalue d){

        SQLiteDatabase sq  = this.getWritableDatabase();

        ContentValues c = new ContentValues();
        c.put(COL_NAME, d.getName());
        c.put(COL_NAME2, d.getDate());

        sq.insert(TABLE_NAME, null, c);
        sq.close();

    }
   public String[] qdata() {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT * FROM "+TABLE_NAME;

        Cursor c = sq.rawQuery(q, null);

        String[] recevieddata = new String[c.getCount()];

        c.moveToFirst();

        if(c.moveToFirst()){
            int counter = 0 ;
            do {
                recevieddata[counter] = c.getString(c.getColumnIndex(COL_NAME+"")) +"\nDATE: "+
                        c.getString(c.getColumnIndex(COL_NAME2+""));
                counter = counter+1;

            } while(c.moveToNext());

        }

        return recevieddata;
    }
public     String qdate(int _id) {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT "+COL_NAME2+" FROM "+TABLE_NAME+" WHERE "+COL_NAME+" = "+_id;

        Cursor c = sq.rawQuery(q, null);
        String s = "";

        c.moveToFirst();

        if(c.moveToFirst()) {
            s = c.getString(c.getColumnIndex(COL_NAME+""));
        }

        return s;

    }





}
