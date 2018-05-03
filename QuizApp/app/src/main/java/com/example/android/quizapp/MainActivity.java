package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String questionOne;
    String questionTwo;
    String questionThree;
    String questionFour;
    String questionFourBonus;
    String questionFive;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Method checks if correct Radio Button is chosen, returns string Correct or Incorrect to global variable questionOne
     * Question One
     */

    public String questionOne() {
        RadioButton optionFour = (RadioButton) findViewById(R.id.question_one_option_four);
        if (optionFour.isChecked()) {
            questionOne = getResources().getString(R.string.correct);
            score = score + 1;
        } else questionOne = getResources().getString(R.string.incorrect);
        return questionOne;
    }

    public String questionTwo() {
        CheckBox optionOne = (CheckBox) findViewById(R.id.question_two_option_one);
        boolean optionOneChecked = optionOne.isChecked();
        CheckBox optionTwo = (CheckBox) findViewById(R.id.question_two_option_two);
        boolean optionTwoChecked = optionTwo.isChecked();
        CheckBox optionThree = (CheckBox) findViewById(R.id.question_two_option_three);
        boolean optionThreeChecked = optionThree.isChecked();
        CheckBox optionFour = (CheckBox) findViewById(R.id.question_two_option_four);
        boolean optionFourChecked = optionFour.isChecked();
        CheckBox optionFive = (CheckBox) findViewById(R.id.question_two_option_five);
        boolean optionFiveChecked = optionFive.isChecked();
        CheckBox optionSix = (CheckBox) findViewById(R.id.question_two_option_six);
        boolean optionSixChecked = optionSix.isChecked();
        CheckBox optionSeven = (CheckBox) findViewById(R.id.question_two_option_seven);
        boolean optionSevenChecked = optionSeven.isChecked();
        CheckBox optionEight = (CheckBox) findViewById(R.id.question_two_option_eight);
        boolean optionEightChecked = optionEight.isChecked();

        if (optionOneChecked && optionTwoChecked && optionFourChecked && optionFiveChecked && optionSevenChecked && optionEightChecked) {
            questionTwo = getResources().getString(R.string.correct);
            score = score + 1;
        } else questionTwo = getResources().getString(R.string.incorrect);

        if (optionThreeChecked) {
            questionTwo = getResources().getString(R.string.incorrect);
        }
        if (optionSixChecked) {
            questionTwo = getResources().getString(R.string.incorrect);
        }
        return questionTwo;
    }

    public String questionThree() {
        EditText questionThreeField = (EditText) findViewById(R.id.question_three_answer);
        String questionThreeAnswer = questionThreeField.getText().toString();
        if (questionThreeAnswer.equalsIgnoreCase(getResources().getString(R.string.bible))) {
            questionThree = getResources().getString(R.string.correct);
            score = score + 1;
        } else if (questionThreeAnswer.equalsIgnoreCase(getResources().getString(R.string.holy_bible))) {
            questionThree = getResources().getString(R.string.correct);
            score = score + 1;
        } else if (questionThreeAnswer.equalsIgnoreCase(getResources().getString(R.string.the_holy_bible))) {
            questionThree = getResources().getString(R.string.correct);
            score = score + 1;
        } else if (questionThreeAnswer.equalsIgnoreCase(getResources().getString(R.string.the_bible))) {
            questionThree = getResources().getString(R.string.correct);
            score = score + 1;
        } else questionThree = getResources().getString(R.string.incorrect);
        return questionThree;
    }

    public String questionFour() {
        RadioButton optionFour = (RadioButton) findViewById(R.id.question_four_option_four);
        if (optionFour.isChecked()) {
            questionFour = getResources().getString(R.string.correct);
            score = score + 1;
        } else questionFour = getResources().getString(R.string.incorrect);
        return questionFour;
    }

    public String questionFourBonus() {
        EditText questionFourBonusField = (EditText) findViewById(R.id.question_four_bonus);
        String questionFourBonusAnswer = questionFourBonusField.getText().toString();
        if (questionFourBonusAnswer.equalsIgnoreCase("Khmer")) {
            questionFourBonus = getResources().getString(R.string.correct);
            score = score + 1;
        } else questionFourBonus = getResources().getString(R.string.incorrect);
        return questionFourBonus;
    }

    public String questionFive() {
        CheckBox optionOne = (CheckBox) findViewById(R.id.question_five_option_one);
        boolean optionOneChecked = optionOne.isChecked();
        CheckBox optionTwo = (CheckBox) findViewById(R.id.question_five_option_two);
        boolean optionTwoChecked = optionTwo.isChecked();
        CheckBox optionThree = (CheckBox) findViewById(R.id.question_five_option_three);
        boolean optionThreeChecked = optionThree.isChecked();
        CheckBox optionFour = (CheckBox) findViewById(R.id.question_five_option_four);
        boolean optionFourChecked = optionFour.isChecked();
        CheckBox optionFive = (CheckBox) findViewById(R.id.question_five_option_five);
        boolean optionFiveChecked = optionFive.isChecked();
        CheckBox optionSix = (CheckBox) findViewById(R.id.question_five_option_six);
        boolean optionSixChecked = optionSix.isChecked();
        CheckBox optionSeven = (CheckBox) findViewById(R.id.question_five_option_seven);
        boolean optionSevenChecked = optionSeven.isChecked();
        if (optionTwoChecked && optionThreeChecked && optionFiveChecked && optionSixChecked) {
            questionFive = getResources().getString(R.string.correct);
            score = score + 1;
        } else questionFive = getResources().getString(R.string.incorrect);

        if (optionOneChecked) {
            questionFive = getResources().getString(R.string.incorrect);
        }
        if (optionFourChecked) {
            questionFive = getResources().getString(R.string.incorrect);
        }

        if (optionSevenChecked) {
            questionFive = getResources().getString(R.string.incorrect);
        }
        return questionFive;
    }


    public void calculateScore() {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFourBonus();
        questionFive();

    }

    public void gradeQuiz(View view) {
        calculateScore();
        String scoreMessage = getResources().getString(R.string.score_message);
        scoreMessage = scoreMessage + score;
        scoreMessage = scoreMessage + getResources().getString(R.string.question_one_grade) + questionOne;
        scoreMessage = scoreMessage + getResources().getString(R.string.question_two_grade) + questionTwo;
        scoreMessage = scoreMessage + getResources().getString(R.string.question_three_grade) + questionThree;
        scoreMessage = scoreMessage + getResources().getString(R.string.question_four_grade) + questionFour;
        scoreMessage = scoreMessage + getResources().getString(R.string.question_four_bonus_grade) + questionFourBonus;
        scoreMessage = scoreMessage + getResources().getString(R.string.question_five_grade) + questionFive;
        Toast.makeText(this, scoreMessage, Toast.LENGTH_LONG).show();
        score = 0;
    }
}

