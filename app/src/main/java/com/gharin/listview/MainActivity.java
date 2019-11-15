package com.gharin.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] menuItem = {"Nasi Goreng", "Nasi Ayam", "Rendang", "Mie Ayam", "Roti Cane", "Telur Gulung", "Ikan Gurame Bakar", "Martabak Telur", "Martabak Masik"};
    Integer[] menuImage = {
            R.drawable.nasigoreng,
            R.drawable.nasiayam,
            R.drawable.rendang,
            R.drawable.mieayam,
            R.drawable.roticane,
            R.drawable.telurgulang,
            R.drawable.ikangurame,
            R.drawable.martabak,
            R.drawable.martabakmanis};
    String[] menuLagi = {"Rasanya enak apa lagi ini untuk sarapan", "ini enak jika di makan pada siang hari", "Jika berkumpul kalian bisa yang ini", "ini menu paling enak jika di santap pada malam hari",
            "ini jika di barengin sama mie aceh", "ini sangat enak untuk ngemil", "jika berkumpul kalian bisa yang ini juga", "jika makan ini enak nya saat masih hangat",
            "jika kalian selera manis kalia bisa coba yang ini"};

    String[] url = {"https://www.fimela.com/lifestyle-relationship/read/3896475/resep-nasi-goreng-telur-sederhana-enak-banget", "https://www.fimela.com/lifestyle-relationship/read/3757240/resep-nasi-ayam-sederhana-pakai-rice-cooker", "https://www.happyfresh.id/blog/resep-rendang-padang-asli-minang/",
            "https://review.bukalapak.com/food/resep-mie-ayam-yang-enak-rahasianya-ada-di-minyak-ayam-ini-22510","https://www.fimela.com/lifestyle-relationship/read/3773915/resep-cara-membuat-roti-canai-sederhana","https://id.theasianparent.com/resep-telur-gulung",
            "https://www.masakapahariini.com/resep/resep-ikan-gurame-bakar-kecap-bango/","https://www.masakapahariini.com/resep/resep-martabak-mie-telur/","https://www.liputan6.com/citizen6/read/3625984/cara-membuat-martabak-manis-serta-martabak-manis-kekinian-dengan-berbagai-ide-adonan-dan-topping"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CostumListAdapter adapter = new CostumListAdapter(this, menuItem, menuImage, menuLagi);
        listView = (ListView)findViewById(R.id.mobilelist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Yang diklik adalah posisi ke : " + position, Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, DetailAct.class)
                .putExtra("url", url[position]));
            }
        });
    }
}