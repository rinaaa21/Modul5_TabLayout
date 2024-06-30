package com.example.modul5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Tab3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab3);

        ImageView imageView = findViewById(R.id.imageView);
        TextView title = findViewById(R.id.title);
        TextView description = findViewById(R.id.description);

        imageView.setImageResource(R.drawable.ti);
        title.setText("Prodi Teknik Informatika");
        description.setText("Visi dari Teknik Informatika adalah Terwujudnya Program Studi Teknik Informatika yang handal dan unggul dibidang informatika khususnya bidang Rekayasa Perangkat Lunak, dan Pengolahan Citra dan memiliki komitmen tinggi dalam Pemberdayaan Masyarakat pada tahun 2032." +
                "\nPROFIL LULUSAN & PILIHAN KARIR: \n" +
                "Software Developer, Game Developer, Software Quality Assurance, Software Consultant, Technopreneur, dll.");
    }
}