package id.tecart.apzet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MISQuest2Chap5Activity extends AppCompatActivity {
    String rightAnswer1;
    String rightAnswer2;
    String rightAnswer3;
    String rightAnswer4;
    String word1;
    String word2;
    String word3;
    String word4;
    Button choice1Button;
    Button choice2Button;
    Button choice3Button;
    Button choice4Button;
    Button nextButton;
    TextView questionTextView;
    int countAnswer = 0;
    int flagAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_quest2_chap5);
        Intent getExtraIntent = getIntent();
        if (getExtraIntent != null){
            word1 = getExtraIntent.getStringExtra("WORD1");
            word2 = getExtraIntent.getStringExtra("WORD2");
            word3 = getExtraIntent.getStringExtra("WORD3");
            word4 = getExtraIntent.getStringExtra("WORD4");
            rightAnswer1 = getExtraIntent.getStringExtra("rightAnswer1");
            rightAnswer2 = getExtraIntent.getStringExtra("rightAnswer2");
            rightAnswer3 = getExtraIntent.getStringExtra("rightAnswer3");
            rightAnswer4 = getExtraIntent.getStringExtra("rightAnswer4");
        }

        choice1Button = (Button) findViewById(R.id.choice1Button);
        choice2Button = (Button) findViewById(R.id.choice2Button);
        choice3Button = (Button) findViewById(R.id.choice3Button);
        choice4Button = (Button) findViewById(R.id.choice4Button);
        questionTextView = (TextView) findViewById(R.id.questionTextView);
        nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setVisibility(View.INVISIBLE);

        if (rightAnswer1.equals("0")){
            choice1Button.setText(word1);
            choice2Button.setText(word2);
            choice3Button.setText(word3);
            choice4Button.setText(word4);
            questionTextView.setText("Which one is the Game?");
            flagAnswer = 1;
        }
        else if (rightAnswer2.equals("0")){
            choice1Button.setText(word2);
            choice2Button.setText(word1);
            choice3Button.setText(word3);
            choice4Button.setText(word4);
            questionTextView.setText("Which one is the Dish?");
            flagAnswer = 2;
        }
        else if (rightAnswer3.equals("0")){
            choice1Button.setText(word3);
            choice2Button.setText(word2);
            choice3Button.setText(word1);
            choice4Button.setText(word4);
            questionTextView.setText("Which one is the Message?");
            flagAnswer = 3;
        }
        else {
            choice1Button.setText(word4);
            choice2Button.setText(word2);
            choice3Button.setText(word1);
            choice4Button.setText(word3);
            questionTextView.setText("Which one is the Organization?");
            flagAnswer = 4;
        }

        choice1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flagAnswer == 1){
                    rightAnswer1 = "1";
                }
                else if (flagAnswer == 2){
                    rightAnswer2 = "1";
                }
                else if (flagAnswer == 3){
                    rightAnswer3 = "1";
                }
                else {
                    rightAnswer4 = "1";
                }
                Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                countAnswer = Integer.parseInt(rightAnswer1) + Integer.parseInt(rightAnswer2) + Integer.parseInt(rightAnswer3) + Integer.parseInt(rightAnswer4);

                if (countAnswer == 4){
                    Intent intent = new Intent (getApplicationContext(), MISQuest3Activity.class);
                    intent.putExtra("WORD1", word1);
                    intent.putExtra("WORD2", word2);
                    intent.putExtra("WORD3", word3);
                    intent.putExtra("WORD4", word4);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent (getApplicationContext(), MISResultActivity.class);
                    intent.putExtra("score", String.valueOf(countAnswer));
                    startActivity(intent);
                }
            }
        });

        choice2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                countAnswer = Integer.parseInt(rightAnswer1) + Integer.parseInt(rightAnswer2) + Integer.parseInt(rightAnswer3) + Integer.parseInt(rightAnswer4);

                if (countAnswer != 4){
                    Intent intent = new Intent (getApplicationContext(), MISResultActivity.class);
                    intent.putExtra("score", String.valueOf(countAnswer));
                    startActivity(intent);
                }
            }
        });

        choice3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                countAnswer = Integer.parseInt(rightAnswer1) + Integer.parseInt(rightAnswer2) + Integer.parseInt(rightAnswer3) + Integer.parseInt(rightAnswer4);

                if (countAnswer != 4){
                    Intent intent = new Intent (getApplicationContext(), MISResultActivity.class);
                    intent.putExtra("score", String.valueOf(countAnswer));
                    startActivity(intent);
                }
            }
        });

        choice4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                countAnswer = Integer.parseInt(rightAnswer1) + Integer.parseInt(rightAnswer2) + Integer.parseInt(rightAnswer3) + Integer.parseInt(rightAnswer4);

                if (countAnswer != 4){
                    Intent intent = new Intent (getApplicationContext(), MISResultActivity.class);
                    intent.putExtra("score", String.valueOf(countAnswer));
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
    }
}
