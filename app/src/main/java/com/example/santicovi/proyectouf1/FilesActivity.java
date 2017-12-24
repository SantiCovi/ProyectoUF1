package com.example.santicovi.proyectouf1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class FilesActivity extends AppCompatActivity {

    private EditText textBox;

    //lineas d texto a guardar
    static final int READ_BLOCK_SIZE = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_files);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textBox = (EditText) findViewById(R.id.txtText1);
    }

    public void onClickGuardar(View v){
        String str = textBox.getText().toString();
        try{
            FileOutputStream fos = openFileOutput("textFile.txt", MODE_PRIVATE);
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            File file = getFilesDir();
            String strFile = file.getAbsolutePath();
            Log.d("DEBOGNOTES", String.valueOf(strFile));

            //File file = getFilesDir();
            //String strFile = file.toString();
            //Log.d("DEBOGNOTES", strFile);
            //OUTput: D/DEBOGNOTES: /data/data/mysupercompany.nasapi/files

            // Escribimos el String en el archivo
            osw.write(str);
            osw.flush();
            osw.close();

            // Mostramos que se ha guardado
            Toast.makeText(getBaseContext(), "Saved", Toast.LENGTH_SHORT).show();

            textBox.setText("");
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public void onClickCargar(View v){
        try{
            FileInputStream fis = openFileInput("textFile.txt");
            InputStreamReader isr = new InputStreamReader(fis);

            char[] inputBuffer = new char[READ_BLOCK_SIZE];
            String s = "";

            int charRead;
            if((charRead = isr.read(inputBuffer)) > 0){
                // Convertimos los char a String
                String readString = String.copyValueOf(inputBuffer, 0, charRead);
                s += readString;

                //inputBuffer = new char[READ_BLOCK_SIZE];
            }

            // Establecemos en el EditText el texto que hemos leido
            textBox.setText(s);

            // Mostramos un Toast con el proceso completado
            Toast.makeText(getBaseContext(), "Loaded", Toast.LENGTH_SHORT).show();

            isr.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
