package com.example.modul5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Tab2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        ImageView imageView = findViewById(R.id.imageView);
        TextView title = findViewById(R.id.title);
        TextView description = findViewById(R.id.description);
        TextView fakultasList = findViewById(R.id.prodi_list);

        imageView.setImageResource(R.drawable.fkom);
        title.setText("Fakultas Ilmu Komputer");
        description.setText("Fakultas Ilmu Komputer merupakan salah satu fakultas yang ada di Universitas Kuningan dengan telah berdiri sejak lama." +
                "\nDengan Visi Terwujudnya Fakultas  Ilmu Komputer  Universitas Kuningan sebagai  fakultas andal  yang  unggul  dalam  penyelenggaraaan  Tri  Darma  Perguruan  Tinggi  di Wilayah Jawa Barat pada tahun 2032." +
                "\nFakultas Ilmu Komputer memiliki 5 program studi, yaitu:");
        fakultasList.setText("1. Teknik Informatika\n2. Sistem Informasi\n" +
                                "3. Manajamen Informatika\n4. Desain Komunikasi Visual\n5. Teknik Sipil");
    }
}