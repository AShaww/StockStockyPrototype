package com.example.stockstockyprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_one,btn_two,btn_three,btn_four,btn_five,
            btn_six,btn_seven,btn_eight, btn_nine,
            btn_up,btn_left,btn_right,btn_down, btn_add,btn_viewAll;

    ListView lv_wineList;

    EditText et_name,et_itemCode, et_par,et_srFridge,et_lgRack,et_gFridge, et_gRetail,
            et_fstFridge,et_fstRack,et_fstShelf,et_fstCake,et_fstRail,et_cellar;

    ArrayAdapter wineArrayAdapter;
    DataBaseHelper dataBaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_three = findViewById(R.id.btn_three);
        btn_four = findViewById(R.id.btn_four);
        btn_five = findViewById(R.id.btn_five);
        btn_six = findViewById(R.id.btn_six);
        btn_seven = findViewById(R.id.btn_seven);
        btn_eight = findViewById(R.id.btn_eight);
        btn_nine = findViewById(R.id.btn_nine);

        btn_up = findViewById(R.id.btn_up);
        btn_left = findViewById(R.id.btn_left);
        btn_right = findViewById(R.id.btn_right);
        btn_down = findViewById(R.id.btn_down);

        btn_add = findViewById(R.id.btn_add);
        btn_viewAll = findViewById(R.id.btn_viewAll);
        lv_wineList = findViewById(R.id.lv_wineList);

        //Element names for text input
        et_name = findViewById(R.id.et_name);
        et_itemCode = findViewById(R.id.et_itemCode);
        et_par = findViewById(R.id.et_par);
        et_srFridge = findViewById(R.id.et_srFridge);
        et_lgRack = findViewById(R.id.et_lgRack);
        et_gRetail = findViewById(R.id.et_gRetail);

        et_gFridge = findViewById(R.id.et_gFridge);
        et_fstFridge = findViewById(R.id.et_fstFridge);
        et_fstRack = findViewById(R.id.et_fstRack);
        et_fstShelf = findViewById(R.id.et_fstShelf);
        et_fstCake = findViewById(R.id.et_fstCake);
        et_fstRail = findViewById(R.id.et_fstRail);
        et_cellar = findViewById(R.id.et_cellar);

        dataBaseHelper = new DataBaseHelper(MainActivity.this);

        ShowWineOnListView(dataBaseHelper);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WineStockModel wineStockModel;
                try {

                    wineStockModel = new WineStockModel(-1,
                            et_name.getText().toString(), Integer.parseInt(et_itemCode.getText().toString()), Integer.parseInt(et_par.getText().toString()), Integer.parseInt(et_srFridge.getText().toString()), Integer.parseInt(et_lgRack.getText().toString()), Integer.parseInt(et_gRetail.getText().toString()), Integer.parseInt(et_gFridge.getText().toString()), Integer.parseInt(et_fstFridge.getText().toString()), Integer.parseInt(et_fstRack.getText().toString()), Integer.parseInt(et_fstShelf.getText().toString()), Integer.parseInt(et_fstCake.getText().toString()), Integer.parseInt(et_fstRail.getText().toString()), Integer.parseInt(et_cellar.getText().toString()));

                    Toast.makeText(MainActivity.this, wineStockModel.toString(), Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error creating Customer", Toast.LENGTH_SHORT).show();
                    wineStockModel = new WineStockModel(-1, "Error", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

                }
                DataBaseHelper dataBaseHelper = new DataBaseHelper(MainActivity.this);
                //Parse integer and change to string with Integer.parseInt(et_age.getText().toString());
                boolean success = dataBaseHelper.addOne(wineStockModel);
                ShowWineOnListView(dataBaseHelper);
                Toast.makeText(MainActivity.this, "Success= " + success, Toast.LENGTH_SHORT).show();

            }

        });
        btn_viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataBaseHelper dataBaseHelper = new DataBaseHelper(MainActivity.this);

                ShowWineOnListView(dataBaseHelper);
            }
        });

        lv_wineList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WineStockModel clickedCustomer = (WineStockModel) parent.getItemAtPosition(position);
                dataBaseHelper.deleteOne(clickedCustomer);
                ShowWineOnListView(dataBaseHelper);
                Toast.makeText(MainActivity.this, "Deleted" + clickedCustomer.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        // click for each button in number 1 - 9
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // click function for arrow keys to control sql database
        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        lv_wineList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }

    private void ShowWineOnListView(DataBaseHelper dataBaseHelper) {
        wineArrayAdapter = new ArrayAdapter<WineStockModel>(MainActivity.this, android.R.layout.simple_list_item_1, dataBaseHelper.getEveryone());
        lv_wineList.setAdapter((wineArrayAdapter));
    }
}