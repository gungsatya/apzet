package id.tecart.apzet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MISQuest5Activity extends AppCompatActivity {
    String word1;
    String word2;
    String word3;
    String word4;
    String scoreFreeRecall;
    String answer1Flag;
    String answer2Flag;
    String answer3Flag;
    String answer4Flag;
    int scoreCuedRecall = 0;
    TextView questionTextView;
    TextView belowTextView;
    EditText answerEditText;
    Button submitButton;
    Button nextButton;
    int flag = 1;
    int loopSubmit;
    int tappingSubmit = 1;
    int scoreTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_quest5);
        Intent getExtraIntent = getIntent();
        if (getExtraIntent != null){
            word1 = getExtraIntent.getStringExtra("WORD1");
            word2 = getExtraIntent.getStringExtra("WORD2");
            word3 = getExtraIntent.getStringExtra("WORD3");
            word4 = getExtraIntent.getStringExtra("WORD4");
            scoreFreeRecall = getExtraIntent.getStringExtra("scoreFreeRecall");
            answer1Flag = getExtraIntent.getStringExtra("answer1Flag");
            answer2Flag = getExtraIntent.getStringExtra("answer2Flag");
            answer3Flag = getExtraIntent.getStringExtra("answer3Flag");
            answer4Flag = getExtraIntent.getStringExtra("answer4Flag");
        }

        questionTextView = (TextView) findViewById(R.id.questionTextView);
        belowTextView = (TextView) findViewById(R.id.belowTextView);
        answerEditText = (EditText) findViewById(R.id.answerEditText);
        submitButton = (Button) findViewById(R.id.submitButton);
        nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setVisibility(View.INVISIBLE);

        loopSubmit = getLoopSubmit();
        setQuestion();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tappingSubmit == loopSubmit){
                    nextButton.setVisibility(View.VISIBLE);
                    submitButton.setVisibility(View.INVISIBLE);
                    answerEditText.setVisibility(View.INVISIBLE);
                    questionTextView.setText("You have done, now see the result");
                    belowTextView.setText("tap next to continue");

                }
                else{
                    if (flag == 1){
                        String answer = answerEditText.getText().toString();
                        if (answer.toUpperCase().equals(word1.toUpperCase())){
                            answer1Flag = "1";
                            scoreCuedRecall += 1;
                            setQuestion();
                        }
                        tappingSubmit += 1;
                        answerEditText.setText("");
                    }
                    else if (flag == 2){
                        String answer = answerEditText.getText().toString();
                        if (answer.toUpperCase().equals(word2.toUpperCase())){
                            answer2Flag = "1";
                            scoreCuedRecall += 1;
                            setQuestion();
                        }
                        tappingSubmit += 1;
                        answerEditText.setText("");
                    }
                    else if (flag == 3){
                        String answer = answerEditText.getText().toString();
                        if (answer.toUpperCase().equals(word3.toUpperCase())){
                            answer3Flag = "1";
                            scoreCuedRecall += 1;
                            setQuestion();
                        }
                        tappingSubmit += 1;
                        answerEditText.setText("");
                    }
                    else {
                        String answer = answerEditText.getText().toString();
                        if (answer.toUpperCase().equals(word4.toUpperCase())){
                            answer4Flag = "1";
                            scoreCuedRecall += 1;
                            setQuestion();
                        }
                        tappingSubmit += 1;
                        answerEditText.setText("");
                    }
                }
                Toast.makeText(getApplicationContext(), "Submit successful", Toast.LENGTH_SHORT).show();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTotal = Integer.parseInt(scoreFreeRecall) + scoreCuedRecall;
                Intent intent = new Intent(getApplicationContext(), MISResultActivity.class);
                intent.putExtra("score", String.valueOf(scoreTotal));
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
    }

    public int getLoopSubmit(){
        int a, b, c, d, total = 0;
        a = Integer.parseInt(answer1Flag);
        b = Integer.parseInt(answer2Flag);
        c = Integer.parseInt(answer3Flag);
        d = Integer.parseInt(answer4Flag);

        if (a == 0){
            total += 1;
        }
        if (b == 0){
            total += 1;
        }
        if (c == 0){
            total += 1;
        }
        if (d == 0){
            total += 1;
        }
        return total;
    }

    public void setQuestion(){
        if (answer1Flag.equals("0")){
            questionTextView.setText("What was the Game?");
            flag = 1;
        }
        else if (answer2Flag.equals("0")){
            questionTextView.setText("What was the Dish?");
            flag = 2;
        }
        else if (answer3Flag.equals("0")){
            questionTextView.setText("What was the Message?");
            flag = 3;
        }
        else{
            questionTextView.setText("What was the Organization?");
            flag = 4;
        }
    }
}
