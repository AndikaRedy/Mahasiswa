package com.andika.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFoto;
    TextView textViewNamaMahasiswa, textViewnimMahasiswa, textViewkelasMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFoto = findViewById(R.id.imageViewFoto);
        textViewNamaMahasiswa = findViewById(R.id.textViewNamaMahasiswa);
        textViewnimMahasiswa = findViewById(R.id.textViewnimMahasiswa);
        textViewkelasMahasiswa = findViewById(R.id.textViewkelasMahasiswa);

        getIncomingExtra();

    }

    private  void getIncomingExtra(){

        if(getIntent().hasExtra("foto") && getIntent().hasExtra("nama_mahasiswa") && getIntent().hasExtra("nim_mahasiswa") && getIntent().hasExtra("kelas_mahasiswa")){

            String foto = getIntent().getStringExtra("foto");
            String namaMahasiswa = getIntent().getStringExtra("nama_mahasiswa");
            String nimMahasiswa = getIntent().getStringExtra("nim_mahasiswa");
            String kelasMahasiswa = getIntent().getStringExtra("kelas_mahasiswa");

            setDataActivity(foto, namaMahasiswa, nimMahasiswa, kelasMahasiswa);
        }
    }

    private void setDataActivity(String foto, String namaMahasiswa, String nimMahasiswa, String kelasMaasiswa){

        Glide.with(this).asBitmap().load(foto).into(imageViewFoto);

        textViewNamaMahasiswa.setText(namaMahasiswa);
        textViewnimMahasiswa.setText(nimMahasiswa);
        textViewkelasMahasiswa.setText(kelasMaasiswa);

    }
}
