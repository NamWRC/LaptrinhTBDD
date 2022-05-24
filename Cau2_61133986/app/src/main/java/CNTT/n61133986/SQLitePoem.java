package CNTT.n61133986;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLitePoem extends SQLiteOpenHelper {
    public SQLitePoem(@Nullable Context context) {
        super(context, "DataBasePoem.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_poem = "create table POEM(MaTho varchar(4) primary key, TenTho Varchar(20))";
        db.execSQL(create_poem);
    }
    public void add(Poem PO){
        SQLiteDatabase database = getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("MaTho",PO.getMaTho());
        contentValues.put("TenTho",PO.getTenTho());
        database.insert("POEM",null,contentValues);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
