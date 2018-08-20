package id.tecart.apzet;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MISQuest4Activity extends AppCompatActivity {
    String word1;
    String word2;
    String word3;
    String word4;
    String answer1;
    String answer2;
    String answer3;
    String answer4;
    String answer1Flag = "0";
    String answer2Flag = "0";
    String answer3Flag = "0";
    String answer4Flag = "0";
    EditText answerEditText;
    Button submitButton;
    TextView timeTextView;
    Button nextButton;
    TextView upperTextView;
    TextView belowTextView;
    CountDownTimer countDownTimer;
    int tappingSubmit = 1;
    int scoreTotal = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_quest4);
        final Intent getExtraIntent = getIntent();
        if (getExtraIntent != null){
            word1 = getExtraIntent.getStringExtra("WORD1");
            word2 = getExtraIntent.getStringExtra("WORD2");
            word3 = getExtraIntent.getStringExtra("WORD3");
            word4 = getExtraIntent.getStringExtra("WORD4");
        }

        answerEditText = (EditText) findViewById(R.id.answerEditText);
        submitButton = (Button) findViewById(R.id.submitButton);
        timeTextView = (TextView) findViewById(R.id.timeTextView);
        nextButton = (Button) findViewById(R.id.nextButton);
        upperTextView = (TextView) findViewById(R.id.upperTextView);
        belowTextView = (TextView) findViewById(R.id.belowTextView);
        nextButton.setVisibility(View.INVISIBLE);

        countDownTimer = new CountDownTimer(21000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeTextView.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                timeTextView.setText("0");
                nextButton.setVisibility(View.VISIBLE);
                answerEditText.setVisibility(View.INVISIBLE);
                submitButton.setVisibility(View.INVISIBLE);

                if (scoreTotal == 8){
                    upperTextView.setText("Looks like you doing very good");
                    belowTextView.setText("tap next to continue");
                }
                else {
                    upperTextView.setText("Looks like you not remembered all the words");
                    belowTextView.setText("tap next to continue");
                }
            }
        };
        countDownTimer.start();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tappingSubmit == 1){
                    answer1 = answerEditText.getText().toString();
                    if (answer1.toUpperCase().equals(word1.toUpperCase())){
                        scoreTotal += 1;
                        answer1Flag = "1";
                    }
                    if (answer1.toUpperCase().equals(word2.toUpperCase())){
                        scoreTotal += 1;
                        answer2Flag = "1";
                    }
                    if (answer1.toUpperCase().equals(word3.toUpperCase())){
                        scoreTotal += 1;
                        answer3Flag = "1";
                    }
                    if (answer1.toUpperCase().equals(word4.toUpperCase())){
                        scoreTotal += 1;
                        answer3Flag = "1";
                    }
                    System.out.println("Score: " + scoreTotal);
                    answerEditText.setText("");
                    tappingSubmit += 1;
                }
                else if (tappingSubmit == 2){
                    answer2 = answerEditText.getText().toString();
                    if (answer2.toUpperCase().equals(word1.toUpperCase())){
                        scoreTotal += 1;
                        answer1Flag = "1";
                    }
                    if (answer2.toUpperCase().equals(word2.toUpperCase())){
                        scoreTotal += 1;
                        answer2Flag = "1";
                    }
                    if (answer2.toUpperCase().equals(word3.toUpperCase())){
                        scoreTotal += 1;
                        answer3Flag = "1";
                    }
                    if (answer2.toUpperCase().equals(word4.toUpperCase())){
                        scoreTotal += 1;
                        answer4Flag = "1";
                    }
                    System.out.println("Score: " + scoreTotal);
                    answerEditText.setText("");
                    tappingSubmit += 1;
                }
                else if (tappingSubmit == 3){
                    answer3 = answerEditText.getText().toString();
                    if (answer3.toUpperCase().equals(word1.toUpperCase())){
                        scoreTotal += 1;
                        answer1Flag = "1";
                    }
                    if (answer3.toUpperCase().equals(word2.toUpperCase())){
                        scoreTotal += 1;
                        answer2Flag = "1";
                    }
                    if (answer3.toUpperCase().equals(word3.toUpperCase())){
                        scoreTotal += 1;
                        answer3Flag = "1";
                    }
                    if (answer3.toUpperCase().equals(word4.toUpperCase())){
                        scoreTotal += 1;
                        answer4Flag = "1";
                    }
                    System.out.println("Score: " + scoreTotal);
                    answerEditText.setText("");
                    tappingSubmit += 1;
                }
                else {
                    answer4 = answerEditText.getText().toString();
                    if (answer4.toUpperCase().equals(word1.toUpperCase())){
                        scoreTotal += 1;
                        answer1Flag = "1";
                    }
                    if (answer4.toUpperCase().equals(word2.toUpperCase())){
                        scoreTotal += 1;
                        answer2Flag = "1";
                    }
                    if (answer4.toUpperCase().equals(word3.toUpperCase())){
                        scoreTotal += 1;
                        answer3Flag = "1";
                    }
                    if (answer4.toUpperCase().equals(word4.toUpperCase())){
                        scoreTotal += 1;
                        answer4Flag = "1";
                    }
                    System.out.println("Score: " + scoreTotal);
                    answerEditText.setText("");
                    tappingSubmit += 1;
                    submitButton.setVisibility(View.GONE);
                    answerEditText.setVisibility(View.GONE);
                }
                Toast.makeText(getApplicationContext(), "Submit successful", Toast.LENGTH_SHORT).show();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTotal *= 2;
                if (scoreTotal == 8){
                    Intent intent = new Intent(getApplicationContext(), MISResultActivity.class);
                    intent.putExtra("score", String.valueOf(scoreTotal));
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), MISQuest5Activity.class);
                    intent.putExtra("scoreFreeRecall", String.valueOf(scoreTotal));
                    intent.putExtra("WORD1", word1);
                    intent.putExtra("WORD2", word2);
                    intent.putExtra("WORD3", word3);
                    intent.putExtra("WORD4", word4);
                    intent.putExtra("answer1Flag", String.valueOf(answer1Flag));
                    intent.putExtra("answer2Flag", String.valueOf(answer2Flag));
                    intent.putExtra("answer3Flag", String.valueOf(answer3Flag));
                    intent.putExtra("answer4Flag", String.valueOf(answer4Flag));
                    startActivity(intent);
                }
            }
        });


    }

    @Override
    public void onBackPressed() {
    }
}

