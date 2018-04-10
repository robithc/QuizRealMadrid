package com.example.android.quizrealmadrid;

        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    int endScore = 0;
    Button buttonShowScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShowScore = (Button) findViewById(R.id.score_button);
        buttonShowScore.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View v) {
        //Your Logic
        checkAllAnswers();
    }




    //Check answer for question 1

    private void checkQuestionOne() {
    EditText questionOneEditText = (EditText) findViewById(R.id.question_1_edit_text);
    String questionOneAnswer = questionOneEditText.getText().toString();
    String rightAnswer = "florentino perez";
    if (questionOneAnswer.toLowerCase().equals(rightAnswer)){
        endScore += 1;
        }

    }
    public void onClickChechbox(View v) {
        //Your Logic
        checkAllAnswers();
    }
    //Check answer for question 2

    public void checkQuestionTwo( View v) {
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
        String endScoreText = "Your score is " + endScore;
        Toast.makeText(this,endScoreText, Toast.LENGTH_LONG).show();

        if (answerTwoChecked & answerFourChecked){
            endScore =+1;
        }



    }


    //Check answer for question 2

    private void checkQuestionThree() {


    }

    //Check answer for question 3

    private void checkQuestionFour() {


    }
    private void checkAllAnswers(){
        checkQuestionOne();
        //checkQuestionTwo(View viev);
        checkQuestionThree();
        checkQuestionFour();
        String endScoreText = "Your score is " + endScore;
        Toast.makeText(this,endScoreText, Toast.LENGTH_LONG).show();
    }

}




