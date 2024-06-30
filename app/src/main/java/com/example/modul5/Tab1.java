package com.example.modul5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Tab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);

        ImageView imageView = findViewById(R.id.imageView);
        TextView title = findViewById(R.id.title);
        TextView description = findViewById(R.id.description);
        TextView fakultas_list = findViewById(R.id.fakultas_list);

        imageView.setImageResource(R.drawable.uniku);
        title.setText("Sejarah Universitas");
        description.setText("Universitas Kuningan (UNIKU) didirikan sebagai perwujudan dari idealisme dan komitmen Yayasan Pendidikan Sang Adipati Kuningan " +
                            "untuk terus menerus berkarya khususnya dalam bidang peningkatan sumber daya manusia menuju peningkatan mutu kehidupan masyarakat pada umumnya." +
                "\nBerdasarkan Surat Keputusan Menteri Pendidikan Nasional Nomor : 62/D/O/2003 tanggal 6 Juni 2003, berdirilah Universitas Kuningan yang merupakan penggabungan keempat sekolah tinggi yang ada di bawah naungan Yayasan Pendidikan Sang Adipati Kuningan. " +
                "Berdirinya Universitas Kuningan diharapkan dapat menjadi kebanggaan masyarakat Kuningan. Universitas ini diresmikan oleh Menteri Pendidikan Nasional Prof. A. Malik Fajar, M.Sc. pada tanggal 17 Juni 2003.\n" +
                "\n" +
                "Berikut adalah daftar fakultas di Universitas Kuningan:");
        fakultas_list.setText("• Fakultas Ilmu Komputer\n• Fakultas Ekonomi dan Bisnis\n" +
                                "• Fakultas Hukum\n• Fakultas Keguruan dan Ilmu Pendidikan\n• Fakultas Kehutanan");
    }
}