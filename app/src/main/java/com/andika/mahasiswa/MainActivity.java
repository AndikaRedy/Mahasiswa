package com.andika.mahasiswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> nimMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(foto, namaMahasiswa, nimMahasiswa, kelasMahasiswa,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        foto.add("https://4.bp.blogspot.com/-BsTsRz7OZTI/UU_GRwUWn_I/AAAAAAAAAZ4/rxB7nFcO0Xs/s1600/bitchpleasej.jpg");
        namaMahasiswa.add("Andika Redy Prihananto");
        nimMahasiswa.add("311710785");
        kelasMahasiswa.add("TI.17.B2");

        foto.add("https://3.bp.blogspot.com/-UQoPNtzfScg/UU_GXEE5BSI/AAAAAAAAAbU/KFCoY1bDawQ/s1600/truestoryn.jpg");
        namaMahasiswa.add("Endang Yogi");
        nimMahasiswa.add("311710786");
        kelasMahasiswa.add("TI.17.B2");

        foto.add("https://2.bp.blogspot.com/-tH1s_LKgMw4/UU_GVv9TGVI/AAAAAAAAAa0/SaIUf-Mgdsk/s1600/notbadv.jpg");
        namaMahasiswa.add("Ressa Septian");
        nimMahasiswa.add("311710787");
        kelasMahasiswa.add("TI.17.B2");

        prosesRecyclerViewAdapter();

    }
}
