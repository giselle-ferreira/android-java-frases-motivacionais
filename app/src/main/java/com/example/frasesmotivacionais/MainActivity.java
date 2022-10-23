package com.example.frasesmotivacionais;

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

    public void mudarFrase(View view) {

        TextView textFrases;

        textFrases = findViewById(R.id.textFrases);

        String[] frases = {
                "A persistência é o caminho do êxito.",
                "O sucesso nasce do querer, da determinação e persistência em se chegar a um objetivo. Mesmo não atingindo o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis.",
                "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre.",
                "Só existe um êxito: a capacidade de levar a vida que se quer.",
                "A vitalidade é demonstrada não apenas pela persistência, mas pela capacidade de começar de novo.",
                "A coragem não é ausência do medo; é a persistência apesar do medo.",
                "Só se pode alcançar um grande êxito quando nos mantemos fiéis a nós mesmos.",
                "Todo mundo é capaz de sentir os sofrimentos de um amigo. Ver com agrado os seus êxitos exige uma natureza muito delicada.",
                "Uma autoimagem forte e positiva é a melhor preparação possível para o sucesso."
        };

        // número randômico que resgata uma posição da frase
        int n = new Random().nextInt(frases.length);

        textFrases.setText(frases[n]);
    }
}