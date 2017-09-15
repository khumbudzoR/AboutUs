package com.example.codetribe.aboutus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView simpleList;
    ArrayList peopleList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (GridView) findViewById(R.id.GridView);
        peopleList.add(new Item("Rulani Nevhufumba" +
                " mLab Provincial Manager | Gauteng\n" +
                "@rulanho ",R.drawable.rulani_nevhufumba));
        peopleList.add(new Item("Lebogang Madise  mLab Provincial Manager | Western Cape & DEMOLA SA Lead\n" +
                "@Lebomadise",R.drawable.lebogang_madise));
        peopleList.add(new Item("Khuthadzo Gundula CodeTribe Facilitator Tshwane | Android Developer\n" +
                "@kgundula",R.drawable.khuthadzo_gundula));
        peopleList.add(new Item("Melvin Musehani mLab Developer in Residence\n" +
                "@theappchemist",R.drawable.melvin_musehani));
    peopleList.add(new Item("Sihle Mabaleka Facilitator CodeTribe Soweto | DEMOLA Johannesburg\n" +
            "@chle_panthera",R.drawable.sihle_mabaleka));
       peopleList.add(new Item("Veronica Mahlangu mLab & CodeTribe Coordinator",R.drawable.veronica_mahlangu));
      peopleList.add(new Item("Tendai Mazhude Operations and M&E Consultant\n" +
              "Linkedin",R.drawable.tendai_mazhude));
        peopleList.add(new Item("Alexandra Fraser",R.drawable.alexandra_fraser));
      peopleList.add(new Item("Zanoxolo Mngadi",R.drawable.zanoxolo_mngadi));
       peopleList.add(new Item("Motebang Mokwatsi",R.drawable.motebang_mokwatsi));
       peopleList.add(new Item("Zakhele Tinga",R.drawable.zakhele_tinga));
       peopleList.add(new Item("Derrick Kotze",R.drawable.derrick_kotze));


        MyAdapter myAdapter=new MyAdapter(this,R.layout.activity_main,peopleList);
        simpleList.setAdapter(myAdapter);

    }
}