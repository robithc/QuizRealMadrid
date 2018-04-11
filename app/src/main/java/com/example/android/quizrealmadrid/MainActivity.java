package com.example.android.quizrealmadrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button showScore;
    int endScore = 0;
    final View.OnClickListener showScoreButtonOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            checkAllAnswers();
            Toast.makeText(MainActivity.this, "Your score is " + endScore  + "/4 correct answers",
                    Toast.LENGTH_LONG).show();
            resetScore();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showScore = (Button) findViewById(R.id.score_button);
        showScore.setOnClickListener(showScoreButtonOnClickListener);
    }


    //Check answer for question 1

    private void checkQuestionOne() {
        EditText questionOneEditText = (EditText) findViewById(R.id.question_1_edit_text);
        String questionOneAnswer = questionOneEditText.getText().toString();
        String rightAnswer = "florentino perez";
        if (questionOneAnswer.toLowerCase().equals(rightAnswer)) {
            endScore += 1;
        }
    }


    //Check answer for question 2

    private void checkQuestionTwo() {

        CheckBox checkBoxQuestionTwoAnswerOne = (CheckBox) findViewById(R.id.question_2_answer_1);
        CheckBox checkBoxQuestionTwoAnswerTwo = (CheckBox) findViewById(R.id.question_2_answer_2);
        CheckBox checkBoxQuestionTwoAnswerThree = (CheckBox) findViewById(R.id.question_2_answer_3);
        CheckBox checkBoxQuestionTwoAnswerFour = (CheckBox) findViewById(R.id.question_2_answer_4);
        CheckBox checkBoxQuestionTwoAnswerFive = (CheckBox) findViewById(R.id.question_2_answer_5);

        Boolean answerOneChecked = checkBoxQuestionTwoAnswerOne.isChecked();
        Boolean answerTwoChecked = checkBoxQuestionTwoAnswerTwo.isChecked();
        Boolean answerThreeChecked = checkBoxQuestionTwoAnswerThree.isChecked();
        Boolean answerFourChecked = checkBoxQuestionTwoAnswerFour.isChecked();
        Boolean answerFiveChecked = checkBoxQuestionTwoAnswerFive.isChecked();

        if (answerTwoChecked && answerFourChecked && !answerOneChecked && !answerThreeChecked && !answerFiveChecked) {
            endScore += 1;

        }
    }

    //Check answer for question 3

    private void checkQuestionThree() {

        RadioButton questionThreeAnswerThree = (RadioButton) findViewById(R.id.question_3_answer_3);
        boolean isQuestionThreeAnswerThree = questionThreeAnswerThree.isChecked();
        if (isQuestionThreeAnswerThree) {
            endScore += 1;
        }
    }
    //Check answer for question 4

    private void checkQuestionFour() {
        RadioButton questionFourAnswerTwo = (RadioButton) findViewById(R.id.question_4_answer_2);
        boolean isQuestionFourAnswerTwo = questionFourAnswerTwo.isChecked();
        if (isQuestionFourAnswerTwo) {
            endScore += 1;
        }
    }
    //Check all answers

    private void checkAllAnswers() {
        checkQuestionOne();
        checkQuestionTwo();
        checkQuestionThree();
        checkQuestionFour();
    }

    //Reset score

    private void resetScore() {
        endScore = 0;
    }

}




