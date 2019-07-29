package com.example.belajarbuah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Apel extends AppCompatActivity {
    EditText editTextApel;
    Button bt_proses;
    TextView hasil;
    String benar = "Apel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apel);


        editTextApel = (EditText)findViewById(R.id.edt_buah_apel);
        bt_proses = (Button)findViewById(R.id.bt_proses_apel);
        hasil = (TextView)findViewById(R.id.hasil_apel);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextApel.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show(); //jika masukan kosong
                }
                else {
                    String jawaban = editTextApel.getText().toString(); //mengambil nilai dari editTextApel
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
