package com.example.belajarbuah;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Ceri extends AppCompatActivity {
    EditText editTextceri;
    Button bt_proses;
    TextView hasil;
    String benar = "Ceri";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceri);


        editTextceri = (EditText)findViewById(R.id.edt_buah_ceri);
        bt_proses = (Button)findViewById(R.id.bt_proses_ceri);
        hasil = (TextView)findViewById(R.id.hasil_ceri);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextceri.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show(); //jika masukan kosong
                }
                else {
                    String jawaban = editTextceri.getText().toString(); //mengambil nilai dari editTextceri
                    if (jawaban.equals(benar)){ // membandingkat masukan dengan ketentuan benar  ".equals()" membandingkan nilai String yang tersimpan.
                        String keterangan = "Selamat, benar";
                        hasil.setText(keterangan);
                    }
                    else{
                        String keterangan = "Ulangi lagi, Salah";
                        hasil.setText(keterangan);
                    }
                }

            }
        });
    }
}
