package com.example.stockstockyprototype;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {

        private static final String WINE_STOCK_TABLE = "WINE_STOCK_TABLE";
        private static final String COLUMN_ID = "COLUMN_ID";
        private static final String COLUMN_WINE_NAME = "COLUMN_WINE_NAME";
        private static final String COLUMN_WINE_CODE = "COLUMN_WINE_CODE";
        private static final String COLUMN_WINE_PAR = "COLUMN_WINE_PAR";
        private static final String COLUMN_SR_FRIDGE = "COLUMN_SR_FRIDGE";
        private static final String COLUMN_LG_RACK = "COLUMN_LG_RACK";
        private static final String COLUMN_LG_FRIDGE = "COLUMN_LG_FRIDGE";
        private static final String COLUMN_LG_RETAIL = "COLUMN_LG_RETAIL";
        private static final String COLUMN_FRST_FRIDGE = "COLUMN_FRST_FRIDGE";
        private static final String COLUMN_FRST_RACK = "COLUMN_FRST_RACK";
        private static final String COLUMN_FRST_SHELF = "COLUMN_FRST_SHELF";
        private static final String COLUMN_FRST_CAKE_FRIDGE = "COLUMN_FRST_CAKE_FRIDGE";
        private static final String COLUMN_FRST_SPEED_RAIL = "COLUMN_FRST_SPEED_RAIL";
        private static final String COLUMN_CELLAR = "COLUMN_CELLAR";

        public DataBaseHelper(@Nullable Context context) {
                super(context, "redWine.db", null, 1);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {
                String createTableStatement = "CREATE TABLE " + WINE_STOCK_TABLE + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_WINE_NAME + " TEXT, " + COLUMN_WINE_CODE + " INT, " + COLUMN_WINE_PAR + " INT, " + COLUMN_SR_FRIDGE + " INT, " + COLUMN_LG_RACK + " INT, " +
                        COLUMN_LG_FRIDGE + " INT, " + COLUMN_LG_RETAIL + " INT, " + COLUMN_FRST_FRIDGE + " INT, " + COLUMN_FRST_RACK + " INT, " + COLUMN_FRST_SHELF + " INT, " + COLUMN_FRST_CAKE_FRIDGE + " INT, " + COLUMN_FRST_SPEED_RAIL + " INT, " + COLUMN_CELLAR + "  INT)";
                db.execSQL(createTableStatement);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {      // needs to be implemented for the SQLite import to work.
        }
        public boolean addOne(WineStockModel wineStockModel){
                SQLiteDatabase db = this.getWritableDatabase();
                ContentValues cv = new ContentValues();

             // hERE CONTINUE
                cv.put(COLUMN_WINE_NAME, wineStockModel.getItemName());
                cv.put(COLUMN_WINE_CODE, wineStockModel.getItemCode());
                cv.put(COLUMN_WINE_PAR, wineStockModel.getPar());
                cv.put(COLUMN_SR_FRIDGE, wineStockModel.getSrFridge());
                cv.put(COLUMN_LG_RACK, wineStockModel.getLgRack());
                cv.put(COLUMN_LG_FRIDGE,wineStockModel.getLgFridge());
                cv.put(COLUMN_LG_RETAIL,wineStockModel.getLgRetail());
                cv.put(COLUMN_FRST_FRIDGE, wineStockModel.getFstFridge());
                cv.put(COLUMN_FRST_RACK, wineStockModel.getFstRack());
                cv.put(COLUMN_FRST_SHELF, wineStockModel.getFstShelf());
                cv.put(COLUMN_FRST_CAKE_FRIDGE, wineStockModel.getFstFridge());
                cv.put(COLUMN_FRST_SPEED_RAIL, wineStockModel.getFstRail());
                cv.put(COLUMN_CELLAR, wineStockModel.getCellar());

                long insert = db.insert(WINE_STOCK_TABLE, null, cv);
                if(insert == -1) {
                        return false;
                }
                else{
                        return true;
                }
        }
        //Deletes value in list using DELETE FROM SQL
        public boolean deleteOne(WineStockModel wineStockModel){
                // find customerModel in database. If found, delete it and return true.
                // if not found, return false.
                SQLiteDatabase db = this.getWritableDatabase();
                String queryString = "DELETE FROM " + WINE_STOCK_TABLE + " WHERE " + COLUMN_ID + " = " + wineStockModel.getId();

                Cursor cursor = db.rawQuery(queryString, null);
                if(cursor.moveToFirst()){
                        return true;
                }
                else {
                        return false;
                }
        }
        public List<WineStockModel> getEveryone(){
                List<WineStockModel> returnList = new ArrayList<>();

                String queryString ="SELECT * FROM " + WINE_STOCK_TABLE;
                SQLiteDatabase db = this.getReadableDatabase();
                Cursor cursor = db.rawQuery(queryString,null);
                if(cursor.moveToFirst()){
                        // loop through the cursor (result set) and create new customer objects. Put them into the return lost.
                        do {

                                int id = cursor.getInt(1);
                                int itemCode = cursor.getInt(2);
                                String itemName = cursor.getString(3);
                                int par = cursor.getInt(4);
                                int srFridge = cursor.getInt(5);
                                int lgRack = cursor.getInt(7);
                                int lgFridge = cursor.getInt(8);
                                int lgRetail = cursor.getInt(9);
                                int fstFridge = cursor.getInt(10);
                                int fstRack = cursor.getInt(11);
                                int fstShelf = cursor.getInt(12);
                                int fstRail = cursor.getInt(13);
                                int cellar = cursor.getInt(14);

                                WineStockModel newWine = new WineStockModel(id,itemCode,itemName,par,srFridge,lgRack,lgFridge,lgRetail,fstFridge,fstRack,fstShelf,fstRail,cellar);

                                returnList.add(newWine);

                        } while (cursor.moveToNext());

                }
                else{
                        // failure does not add anything to the list.

                }
                //closes cursor/database when finished with.
                cursor.close();
                db.close();
                return returnList;
        }
}
