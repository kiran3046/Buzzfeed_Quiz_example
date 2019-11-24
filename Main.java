package BuzzfeedQuiz;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // create 5 questions (Alternatively use text file to populate as many questions as you prefer , check MainTextFile.java)
        QuestionClass question_1=new QuestionClass("Pick a base","Romaine Lettuce",
                                                   "Kale","Pasta","potato");
        QuestionClass question_2=new QuestionClass("Whats your dressing","Caesar",
                                                   "Ranch","Olive oil","lemon");
        QuestionClass question_3=new QuestionClass("Add some protein","Chicken",
                                                    "Egg","Bacon","tofu");
        QuestionClass question_4=new QuestionClass("Add some more dressing","honey mustard",
                                                   "salsa","chilli","No thanks!");
        QuestionClass question_5=new QuestionClass("Add some crunch","Croutons",
                                                    "fried onions","Walnuts","Almonds");

        //create an array of questionclass objects to iterate and display one by one
        QuestionClass QuestionArray[]={question_1,question_2,question_3,question_4,question_5};

        System.out.println("Welcome to Buzzfeed Quiz ! Find out which puppy you are according to your salad choices");

        int[] answer_array=new int[4]; // to store user input answer to each question
                                        // this array will store number of times each answer is selected ,  by default zero
        for(int i=0;i<5;i++){
            System.out.println("Question : "+QuestionArray[i].getQuestion_text());
            System.out.println("a ) "+QuestionArray[i].getOption_a());
            System.out.println("b ) "+QuestionArray[i].getOption_b());
            System.out.println("c ) "+QuestionArray[i].getOption_c());
            System.out.println("d ) "+QuestionArray[i].getOption_d());
            //read user input into answer variable
            char answer=sc.nextLine().charAt(0);

            switch (answer){
                case 'a':
                    answer_array[0]++;
                    break;
                case 'b':
                    answer_array[1]++;
                    break;
                case 'c':
                    answer_array[2]++;
                    break;
                case 'd':
                    answer_array[3]++;
                    break;
                default:
                    break;

            }
        }
        // create answerclass object to get final result answerClass.getResult(answer_array)
        AnswerClass answerClass=new AnswerClass();
        String result=answerClass.getResult(answer_array);
        System.out.println("You are a "+result);
    }
}
