package com.example.nyamundapt.myapplication4;


public class QuestionH {

        public String[] mQuestionH = {
                "Which room has the bed?",
                "What do we use to sweep the house",
                "Where do we cook our food"
        };

        private String mChoices[][] = {
                {"Bathroom", "Kitchen", "Bedroom"},
                {"Mop", "Broom", "Rake"},
                {"Kitchen", "Bedroom", "Bathroom"}
        };

        private String mCorrectAnswers []={"Bedroom", "Broom", "Kitchen"};

        public int getLength(){
            return mQuestionH.length;
        }

        public String getQuestion(int a){
            String question = mQuestionH[a];
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



