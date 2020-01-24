package com.example.bestuniversity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private RecyclerView rvUniversity;
    private ArrayList<University> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUniversity = findViewById(R.id.rv_university);
        rvUniversity.setHasFixedSize(true);

        list.addAll(UniversityData.getListData());
        showRecyclerList();


    }

    private void showRecyclerList(){
        rvUniversity.setLayoutManager(new LinearLayoutManager(this));
        ListUniversityAdapter listHeroAdapter = new ListUniversityAdapter(list);
        rvUniversity.setAdapter(listHeroAdapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setAbout(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setAbout (int Selected){
        switch (Selected){
            case R.id.action_about:

                Intent move = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(move);
                break;

        }
    }



}
