package cn.edu.sdwu.android02.classroom.sn170507180114;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by l on 2020/4/29.
 */
;
public class MyOpenHelper extends SQLiteOpenHelper {
    private String STYDENT_TB_SQL="create table student(id integer primary key autoincrement,stuname text,stutel text)";
    public MyOpenHelper(Context context) {
        //context context上下文，String name数据库名称，CursorFactory factory 传入NULL，int version数据库的版本
        super(context, "stud.db", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //当打开数据库时，发现数据库不存在，此时会自动创建新的数据库，然后调用onCreate方法
        //在本方法中，完成数据库对象（表，视图，索引等）的创建
        //通过SQLiteDatebase对象，完成SQL的执行
        sqLiteDatabase.execSQL(STYDENT_TB_SQL);
        Log.i(MyOpenHelper.class.toString(),"onCreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //当构造方法中指定的版本号，与手机中已有数据库的版本号更新的时候，调用本方法
        sqLiteDatabase.execSQL("alter table add column stuadd text");

    }
}
