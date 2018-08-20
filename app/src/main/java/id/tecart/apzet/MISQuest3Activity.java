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

public class MISQuest3Activity extends AppCompatActivity {
    String word1;
    String word2;
    String word3;
    String word4;
    TextView upper1TextView;
    TextView below1TextView;
    Button continueButton;
    TextView upper2TextView;
    TextView below2TextView;
    EditText answerEditText;
    Button submitButton;
    TextView upper3TextView;
    TextView below3TextView;
    EditText answer1EditText;
    Button submit1Button;
    TextView upper4TextView;
    TextView below4TextView;
    EditText answer2EditText;
    Button submit2Button;
    TextView upperFinishTextView;
    TextView belowFinishTextView;
    TextView timeTextView;
    Button nextButton;
    CountDownTimer countDownTimer;
    int tappingInWord = 1;
    int tappingInNumber = 1;
    int tappingInNumber2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_quest3);
        Intent getExtraIntent = getIntent();
        if (getExtraIntent != null){
            word1 = getExtraIntent.getStringExtra("WORD1");
            word2 = getExtraIntent.getStringExtra("WORD2");
            word3 = getExtraIntent.getStringExtra("WORD3");
            word4 = getExtraIntent.getStringExtra("WORD4");
        }

        upper1TextView = (TextView) findViewById(R.id.upper1TextView);
        below1TextView = (TextView) findViewById(R.id.below1TextView);
        continueButton = (Button) findViewById(R.id.continueButton);
        upper2TextView = (TextView) findViewById(R.id.upper2TextView);
        below2TextView = (TextView) findViewById(R.id.below2TextView);
        answerEditText = (EditText) findViewById(R.id.answerEditText);
        submitButton = (Button)findViewById(R.id.submitButton);
        upper3TextView = (TextView) findViewById(R.id.upper3TextView);
        below3TextView = (TextView) findViewById(R.id.below3TextView);
        answer1EditText = (EditText) findViewById(R.id.answer1EditText);
        submit1Button = (Button)findViewById(R.id.submit1Button);
        upper4TextView = (TextView) findViewById(R.id.upper4TextView);
        below4TextView = (TextView) findViewById(R.id.below4TextView);
        answer2EditText = (EditText) findViewById(R.id.answer2EditText);
        submit2Button = (Button)findViewById(R.id.submit2Button);
        upperFinishTextView = (TextView) findViewById(R.id.upperFinishTextView);
        belowFinishTextView = (TextView) findViewById(R.id.belowFinishTextView);
        timeTextView = (TextView) findViewById(R.id.timeTextView);
        nextButton = (Button) findViewById(R.id.nextButton);

        nextButton.setVisibility(View.INVISIBLE);
        upper2TextView.setVisibility(View.GONE);
        below2TextView.setVisibility(View.GONE);
        answerEditText.setVisibility(View.GONE);
        submitButton.setVisibility(View.GONE);
        upper3TextView.setVisibility(View.GONE);
        below3TextView.setVisibility(View.GONE);
        answer1EditText.setVisibility(View.GONE);
        submit1Button.setVisibility(View.GONE);
        upper4TextView.setVisibility(View.GONE);
        below4TextView.setVisibility(View.GONE);
        answer2EditText.setVisibility(View.GONE);
        submit2Button.setVisibility(View.GONE);
        upperFinishTextView.setVisibility(View.GONE);
        belowFinishTextView.setVisibility(View.GONE);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upper1TextView.setVisibility(View.GONE);
                below1TextView.setVisibility(View.GONE);
                continueButton.setVisibility(View.GONE);
                upper2TextView.setVisibility(View.VISIBLE);
                below2TextView.setVisibility(View.VISIBLE);
                answerEditText.setVisibility(View.VISIBLE);
                submitButton.setVisibility(View.VISIBLE);

                countDownTimer = new CountDownTimer(121000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        timeTextView.setText("" + millisUntilFinished / 1000);
                    }

                    @Override
                    public void onFinish() {
                        timeTextView.setText("0");
                        nextButton.setVisibility(View.VISIBLE);
                        upperFinishTextView.setVisibility(View.VISIBLE);
                        belowFinishTextView.setVisibility(View.VISIBLE);
                        upper2TextView.setVisibility(View.GONE);
                        below2TextView.setVisibility(View.GONE);
                        answerEditText.setVisibility(View.GONE);
                        submitButton.setVisibility(View.GONE);
                        upper3TextView.setVisibility(View.GONE);
                        below3TextView.setVisibility(View.GONE);
                        answer1EditText.setVisibility(View.GONE);
                        submit1Button.setVisibility(View.GONE);
                        upper4TextView.setVisibility(View.GONE);
                        below4TextView.setVisibility(View.GONE);
                        answer2EditText.setVisibility(View.GONE);
                        submit2Button.setVisibility(View.GONE);
                    }
                };
                countDownTimer.start();
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tappingInWord == 1){
                    String answerInWord = answerEditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("E")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInWord += 1;
                    upper2TextView.setText("Please spell the word '*****' backwards");
                    answerEditText.setText("");
                    answerEditText.setHint("2nd word");
                }
                else if (tappingInWord == 2){
                    String answerInWord = answerEditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("L")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInWord += 1;
                    answerEditText.setText("");
                    answerEditText.setHint("3rd word");
                }
                else if (tappingInWord == 3){
                    String answerInWord = answerEditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("P")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInWord += 1;
                    answerEditText.setText("");
                    answerEditText.setHint("4th word");
                }
                else if (tappingInWord == 4){
                    String answerInWord = answerEditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("P")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInWord += 1;
                    answerEditText.setText("");
                    answerEditText.setHint("5th word");
                }
                else {
                    String answerInWord = answerEditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("A")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    upper2TextView.setVisibility(View.GONE);
                    below2TextView.setVisibility(View.GONE);
                    answerEditText.setVisibility(View.GONE);
                    submitButton.setVisibility(View.GONE);
                    upper3TextView.setVisibility(View.VISIBLE);
                    below3TextView.setVisibility(View.VISIBLE);
                    answer1EditText.setVisibility(View.VISIBLE);
                    submit1Button.setVisibility(View.VISIBLE);
                }
            }
        });

        submit1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tappingInNumber == 1){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("20")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("2nd number");
                }
                else if (tappingInNumber == 2){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("19")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("3rd number");
                }
                else if (tappingInNumber == 3){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("18")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("4th number");
                }
                else if (tappingInNumber == 4){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("17")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("5th number");
                }
                else if (tappingInNumber == 5){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("16")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("6th number");
                }
                else if (tappingInNumber == 6){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("15")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("7th number");
                }
                else if (tappingInNumber == 7){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("14")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("8th number");
                }
                else if (tappingInNumber == 8){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("13")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("9th number");
                }
                else if (tappingInNumber == 9){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("12")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("10th number");
                }
                else if (tappingInNumber == 10){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("11")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("11th number");
                }
                else if (tappingInNumber == 11){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("10")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("12th number");
                }
                else if (tappingInNumber == 12){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("9")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("13th number");
                }
                else if (tappingInNumber == 13){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("8")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("14th number");
                }
                else if (tappingInNumber == 14){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("7")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("15th number");
                }
                else if (tappingInNumber == 15){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("6")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("16th number");
                }
                else if (tappingInNumber == 16){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("5")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("17th number");
                }
                else if (tappingInNumber == 17){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("4")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("18th number");
                }
                else if (tappingInNumber == 18){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("3")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("19th number");
                }
                else if (tappingInNumber == 19){
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("2")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber += 1;
                    answer1EditText.setText("");
                    answer1EditText.setHint("20th number");
                }
                else {
                    String answerInNumber = answer1EditText.getText().toString();
                    if (answerInNumber.toUpperCase().equals("1")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    upper3TextView.setVisibility(View.GONE);
                    below3TextView.setVisibility(View.GONE);
                    answer1EditText.setVisibility(View.GONE);
                    submit1Button.setVisibility(View.GONE);
                    upper4TextView.setVisibility(View.VISIBLE);
                    below4TextView.setVisibility(View.VISIBLE);
                    answer2EditText.setVisibility(View.VISIBLE);
                    submit2Button.setVisibility(View.VISIBLE);
                }
            }
        });

        submit2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tappingInNumber2 == 1){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("100")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("2nd number");
                }
                else if (tappingInNumber2 == 2){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("93")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("3rd number");
                }
                else if (tappingInNumber2 == 3){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("86")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("4th number");
                }
                else if (tappingInNumber2 == 4){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("79")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("5th number");
                }
                else if (tappingInNumber2 == 5){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("72")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("6th number");
                }
                else if (tappingInNumber2 == 6){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("65")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("7th number");
                }
                else if (tappingInNumber2 == 7){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("58")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("8th number");
                }
                else if (tappingInNumber2 == 8){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("51")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("9th number");
                }
                else if (tappingInNumber2 == 9){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("44")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("10th number");
                }
                else if (tappingInNumber2 == 10){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("37")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("11th number");
                }
                else if (tappingInNumber2 == 11){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("30")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("12th number");
                }
                else if (tappingInNumber2 == 12){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("23")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("13th number");
                }
                else if (tappingInNumber2 == 13){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("16")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("14th number");
                }
                else if (tappingInNumber2 == 14){
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("9")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    tappingInNumber2 += 1;
                    answer2EditText.setText("");
                    answer2EditText.setHint("15th number");
                }
                else {
                    String answerInWord = answer2EditText.getText().toString();
                    if (answerInWord.toUpperCase().equals("2")){
                        Toast.makeText(getApplicationContext(), "Your answer is correct", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Your answer is incorrect", Toast.LENGTH_SHORT).show();
                    }
                    upper4TextView.setVisibility(View.GONE);
                    below4TextView.setVisibility(View.GONE);
                    answer2EditText.setVisibility(View.GONE);
                    submit2Button.setVisibility(View.GONE);
                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), MISQuest4Activity.class);
                intent.putExtra("WORD1", word1);
                intent.putExtra("WORD2", word2);
                intent.putExtra("WORD3", word3);
                intent.putExtra("WORD4", word4);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
    }
}


