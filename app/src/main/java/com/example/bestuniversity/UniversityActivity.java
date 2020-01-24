package com.example.bestuniversity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class UniversityActivity extends AppCompatActivity {

    public static  final  int photo = 0;
    public static final String nama = "namauniv";
    public static final String detail = "detail univ";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail");

        }
        Log.d(nama, "onCreate: started");
        Log.d(detail, "onCreate: started ");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(nama, "getIncomingIntent: found Intent Extras ");

        if(getIntent().hasExtra(nama) && getIntent().hasExtra(detail) && getIntent().hasExtra("foto")){

            int photoextra = getIntent().getIntExtra("foto",photo);
            String namaextra = getIntent().getStringExtra(nama);
            String detailextra = getIntent().getStringExtra(detail);

            setImage(photoextra,namaextra,detailextra);

        }
    }

    private void setImage(int photoextra,String namaextra, String detailextra){

        TextView name = findViewById(R.id.univ_name);
        name.setText(namaextra);

        TextView detail = findViewById(R.id.univ_detail);
        detail.setText(detailextra);

        ImageView gambar = findViewById(R.id.univ_image);
        Glide.with(this)
                .load(photoextra)
                .apply(new RequestOptions().override(1200, 1500))
                .into(gambar);
    }


}
