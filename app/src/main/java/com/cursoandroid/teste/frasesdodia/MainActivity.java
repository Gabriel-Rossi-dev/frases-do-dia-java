package com.cursoandroid.teste.alignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateNewString ( View view ){

        String[] strings = {
                "A persistência é o caminho do êxito.",
                "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
                "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer.",
                "No meio da dificuldade encontra-se a oportunidade."
        };
        int number = new Random().nextInt(4);// 0 1 2 3

        TextView text = findViewById(R.id.textstring);
        text.setText( strings[ number ] );
    }

}

