package com.example.hp.austguide.database1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.hp.austguide.Info;

/**
 * Created by HP on 8/6/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

      private  static  final  int  DATABASE_VERSION=1;
    private  static  final  String  DATABASE_NAME="infotable.db";

    private  static  final  String  TABLE_NAME="infotable";

    private  static  final  String  COLUMN_ID="_id";
    private  static  final  String  COLUMN_NAME="name";
    private  static  final  String  COLUMN_UNAME="uname";

    private  static  final  String  COLUMN_EMAIL="email";
    private  static  final  String  COLUMN_PASS="pass";
    private  static  final  String  TABLE_CREATE="CREATE TABLE "+TABLE_NAME+" ("+COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_NAME+" VARCHAR(255), "+COLUMN_EMAIL+" VARCHAR(255), "+COLUMN_UNAME+" VARCHAR(255), "+COLUMN_PASS+" VARCHAR(255));";
   SQLiteDatabase db;
private  static  final   String  DROP_TABLE="DROP TABLE "+TABLE_NAME+" IF EXISTS;";

    public  DatabaseHelper(Context context)
    {
        super(context,DATABASE_NAME,null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

         sqLiteDatabase.execSQL(TABLE_CREATE);

     this.db=sqLiteDatabase;
    }
 public  void insertInfo(Info c)
 {
     db=this.getReadableDatabase();
     ContentValues g= new ContentValues();
 g.put(COLUMN_NAME,c.getName());
  g.put(COLUMN_EMAIL,c.getEmail());
     g.put(COLUMN_UNAME,c.getUname());
     g.put(COLUMN_PASS,c.getPass());
     db.insert(TABLE_NAME,null,g);
     db.close();
 }
  public   String searchpass(String uname)
  {
      String p,q;
      q="NOT FOUND";
      db=this.getReadableDatabase();
      String query="SELECT UNAME,PASS FROM "+TABLE_NAME;
      Cursor cursor = db.rawQuery(query,null);
      if(cursor.moveToFirst())
      {
          do{
             p=cursor.getString(0);
              if (p.equals(uname))
              {
                  q=cursor.getString(1);
    break;
              }
          }while (cursor.moveToNext());
      }
      return q;
  }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);
    }
}
