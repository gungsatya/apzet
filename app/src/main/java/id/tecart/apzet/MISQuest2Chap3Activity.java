package id.tecart.apzet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MISQuest2Chap3Activity extends AppCompatActivity {
    String rightAnswer1;
    String rightAnswer2;
    String word1;
    String word2;
    String word3;
    String word4;
    Button choice1Button;
    Button choice2Button;
    Button choice3Button;
    Button choice4Button;
    Button nextButton;
    String rightAnswer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_quest2_chap3);
        Intent getExtraIntent = getIntent();
        if (getExtraIntent != null){
            word1 = getExtraIntent.getStringExtra("WORD1");
            word2 = getExtraIntent.getStringExtra("WORD2");
            word3 = getExtraIntent.getStringExtra("WORD3");
            word4 = getExtraIntent.getStringExtra("WORD4");
            rightAnswer1 = getExtraIntent.getStringExtra("rightAnswer1");
            rightAnswer2 = getExtraIntent.getStringExtra("rightAnswer2");
        }

        choice1Button = (Button) findViewById(R.id.choice1Button);
        choice2Button = (Button) findViewById(R.id.choice2Button);
        choice3Button = (Button) findViewById(R.id.choice3Button);
        choice4Button = (Button) findViewById(R.id.choice4Button);
        nextButton = (Button) findViewById(R.id.nextButton);

        choice1Button.setText(word3);
        choice2Button.setText(word1);
        choice3Button.setText(word4);
        choice4Button.setText(word2);
        nextButton.setVisibility(View.INVISIBLE);

        choice1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightAnswer3 = "1";
                Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (getApplicationContext(), MISQuest2Chap4Activity.class);
                intent.putExtra("rightAnswer1", rightAnswer1);
                intent.putExtra("rightAnswer2", rightAnswer2);
                intent.putExtra("WORD1", word1);
                intent.putExtra("WORD2", word2);
                intent.putExtra("WORD3", word3);
                intent.putExtra("WORD4", word4);
                intent.putExtra("rightAnswer3", rightAnswer3);
                startActivity(intent);
            }
        });

        choice2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightAnswer3 = "0";
                Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (getApplicationContext(), MISQuest2Chap4Activity.class);
                intent.putExtra("rightAnswer1", rightAnswer1);
                intent.putExtra("rightAnswer2", rightAnswer2);
                intent.putExtra("WORD1", word1);
                intent.putExtra("WORD2", word2);
                intent.putExtra("WORD3", word3);
                intent.putExtra("WORD4", word4);
                intent.putExtra("rightAnswer3", rightAnswer3);
                startActivity(intent);
            }
        });

        choice3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightAnswer3 = "0";
                Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (getApplicationContext(), MISQuest2Chap4Activity.class);
                intent.putExtra("rightAnswer1", rightAnswer1);
                intent.putExtra("rightAnswer2", rightAnswer2);
                intent.putExtra("WORD1", word1);
                intent.putExtra("WORD2", word2);
                intent.putExtra("WORD3", word3);
                intent.putExtra("WORD4", word4);
                intent.putExtra("rightAnswer3", rightAnswer3);
                startActivity(intent);
            }
        });

        choice4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rightAnswer3 = "0";
                Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent (getApplicationContext(), MISQuest2Chap4Activity.class);
                intent.putExtra("rightAnswer1", rightAnswer1);
                intent.putExtra("rightAnswer2", rightAnswer2);
                intent.putExtra("WORD1", word1);
                intent.putExtra("WORD2", word2);
                intent.putExtra("WORD3", word3);
                intent.putExtra("WORD4", word4);
                intent.putExtra("rightAnswer3", rightAnswer3);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
    }
}
