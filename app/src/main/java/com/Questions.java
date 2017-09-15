package com;


public class Questions {

    private int mPics;

    public String[] mQuestions = {
            "What is the color of the banana?",
            "A red vegetable...",
            "It is hot when you drink it..."
    };

    private String mChoices[][] = {
            {"Orange", "Yellow", "Green"},
            {"Beetroot", "Cabbage", "Spinach"},
            {"Ice cream", "Juice", "Tea"}
    };

    private String mCorrectAnswers []={"Yellow", "Beetroot", "Tea"};

    public int getLength(){
        return mQuestions.length;
    }



    public int getmPics(){
        return mPics;
    }

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }


}

