package id.tecart.apzet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MISQuest1Activity extends AppCompatActivity {
    TextView word1TextView;
    TextView word2TextView;
    TextView word3TextView;
    TextView word4TextView;
    String[] word1;
    String[] word2;
    String[] word3;
    String[] word4;
    String word1String;
    String word2String;
    String word3String;
    String word4String;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_quest1);
        word1TextView = (TextView) findViewById(R.id.word1TextView);
        word2TextView = (TextView) findViewById(R.id.word2TextView);
        word3TextView = (TextView) findViewById(R.id.word3TextView);
        word4TextView = (TextView) findViewById(R.id.word4TextView);
        nextButton = (Button) findViewById(R.id.nextButton);

        word1 = new String[3];
        word1[0] = "Solitaire";
        word1[1] = "Mahjong";
        word1[2] = "Chess";

        word2 = new String[3];
        word2[0] = "Salad";
        word2[1] = "Pasta";
        word2[2] = "Pizza";

        word3 = new String[3];
        word3[0] = "Telegram";
        word3[1] = "Hangout";
        word3[2] = "Line";

        word4 = new String[3];
        word4[0] = "Red Cross";
        word4[1] = "United Nations";
        word4[2] = "ASEAN";

        word1String = getRandom(word1);
        word2String = getRandom(word2);
        word3String = getRandom(word3);
        word4String = getRandom(word4);

        word1TextView.setText(word1String);
        word2TextView.setText(word2String);
        word3TextView.setText(word3String);
        word4TextView.setText(word4String);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MISQuest2Chap1Activity.class);
                intent.putExtra("WORD1", word1String);
                intent.putExtra("WORD2", word2String);
                intent.putExtra("WORD3", word3String);
                intent.putExtra("WORD4", word4String);
                startActivity(intent);
            }
        });

    }

    public String getRandom(String[] array){
        int index = new Random().nextInt(array.length);
        return array[index];
    }

    @Override
    public void onBackPressed() {
    }
}
