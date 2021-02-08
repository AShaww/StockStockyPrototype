package com.example.stockstockyprototype;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

        public static final String ITEM_NAME = "";


        public static final String WINE_STOCK_TAKE = "WINE_STOCK_TAKE";
        public static final String ITEM_CODE = "ITEM_CODE";
        public static final String WEEK_N_73_PAR = "WEEK_N73_PAR";
        public static final String STOREROOM_FRIDGE = "STOREROOM_FRIDGE";
        public static final String LOWER_GROUND_RACK = "LOWER_GROUND_RACK";
        public static final String GROUND_FLOOR_FRIDGE = "GROUND_FLOOR_FRIDGE";
        public static final String GROUND_FLOOR_BA_INC_RETAILER = "GROUND_FLOOR_BA_INC_RETAILER";
        public static final String FIRST_FLOOR_GLASS_RACK = "FIRST_FLOOR_GLASS_RACK";
        public static final String FIRST_FLOOR_STAINLESS_SHELF = "FIRST_FLOOR_STAINLESS_SHELF";
        public static final String FIRST_FLOOR_BAR_SPEED_RAIL = "FIRST_FLOOR_BAR_SPEED_RAIL";
        public static final String TOTAL_IN_STOCK = "TOTAL_IN_STOCK";
        public static final String VARIANCE = "VARIANCE";
        public static final String ACTIVE_WINE = "ACTIVE_WINE";
        public static final String COLUMN_ID = "ID";    //id is needed so it increments ? lets see...

        public DataBaseHelper(@Nullable Context context) {
                super(context, "redWine.db", null, 1);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {
                String createTableStatement = "CREATE TABLE " + WINE_STOCK_TAKE + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " + ITEM_CODE + ", " + WEEK_N_73_PAR + " , " + STOREROOM_FRIDGE + "," + LOWER_GROUND_RACK + ", " + GROUND_FLOOR_FRIDGE + ", " + GROUND_FLOOR_BA_INC_RETAILER + ", " + FIRST_FLOOR_GLASS_RACK + "," + FIRST_FLOOR_STAINLESS_SHELF + "," + FIRST_FLOOR_BAR_SPEED_RAIL + ", " + TOTAL_IN_STOCK + ", " + VARIANCE + ", " + ACTIVE_WINE + ")";
                db.execSQL(createTableStatement);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {      // needs to be implemented for the SQLite import to work.

        }
}
