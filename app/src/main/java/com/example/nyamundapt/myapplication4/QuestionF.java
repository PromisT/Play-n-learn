package com.example.nyamundapt.myapplication4;

public class QuestionF {

    public String[] mQuestionF = {
           "An animal that gives us milk",
            "An animal that protect us",
            "Most dangerous animal"
    };

    private String mChoices[][] = {
            {"Bird", "Cow", "Chicken"},
            {"Cow", "Cat", "Dog"},
            {"Lion", "Bird", "Chicken"}
    };

    private String mCorrectAnswers []={"Cow", "Dog", "Lion"};

    public int getLength(){
        return mQuestionF.length;
    }

    public String getQuestion(int a){
        String question = mQuestionF[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}


