package id.tecart.apzet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MISResultActivity extends AppCompatActivity {
    String score;
    TextView scoreTextView;
    TextView resultTextView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_result);
        Intent getExtraIntent = getIntent();
        if (getExtraIntent != null){
            score = getExtraIntent.getStringExtra("score");
        }

        scoreTextView = (TextView) findViewById(R.id.scoreTextView);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        backButton = (Button) findViewById(R.id.backButton);

        scoreTextView.setText(score);
        if (Integer.parseInt(score) <= 4){
            resultTextView.setText("You are possible cognitive impairment");
        }
        else {
            resultTextView.setText("You are no cognitive impairment");
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MISResultActivity.this, MISMainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
    }
}
