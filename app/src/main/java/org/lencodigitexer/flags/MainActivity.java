package org.lencodigitexer.flags;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] countries = { "Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, countries);
        setListAdapter(mAdapter);
        AdapterView.OnItemClickListener itemListener = new
                AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        switch (i) {
                            case 0:
                                Intent intent0 = new Intent(MainActivity.this, Argentina.class);
                                startActivity(intent0);
                                break;
                            case 1:
                                Intent intent1 = new Intent(MainActivity.this, Brasilia.class);
                                startActivity(intent1);
                                break;
                            case 2:
                                Intent intent2 = new Intent(MainActivity.this, Chili.class);
                                startActivity(intent2);
                                break;
                            case 3:
                                Intent intent3 = new Intent(MainActivity.this, Columbia.class);
                                startActivity(intent3);
                                break;
                            case 4:
                                Intent intent4 = new Intent(MainActivity.this, Urugvai.class);
                                startActivity(intent4);
                                break;

                        }
                        Toast.makeText(getApplicationContext(), "Вы выбрали " +
                                adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
                    }
                };
        getListView().setOnItemClickListener(itemListener);
    }
}