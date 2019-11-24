package BuzzfeedQuiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class MainTextFile {
    public static void main(String args[]){

        // questions.txt is name of text file to read , create directly inside project folder e.g. project1 and change working directory path to project path
        // To do so , go to run-> edit configurations -> Working directory path and  set to project path e.g. c:\projects\project1
        //Alternatively give full path of file location i.e. String questions_file ="c://projects//project1//questions.txt";
        String questions_file ="questions.txt";
        //read each line of file into String line , initialize to empty string
        String line = "";
        //split each line from file into tokens by comma
        String cvsSplitBy = ",";
        System.out.println("Welcome to Buzzfeed Quiz ! Find out which puppy you are according to your salad choices");

        int[] answer_array=new int[4];
        Scanner sc=new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader(questions_file))) {
            //while end of file is reached
            while ((line = br.readLine()) != null) {
                //read a line and populate questionclass objects
                String[] question_entry = line.split(cvsSplitBy);
                QuestionClass question = new QuestionClass(question_entry[0], question_entry[1], question_entry[2], question_entry[3], question_entry[4]);
                System.out.println("Question : " + question.getQuestion_text());
                System.out.println("a ) " + question.getOption_a());
                System.out.println("b ) " + question.getOption_b());
                System.out.println("c ) " + question.getOption_c());
                System.out.println("d ) " + question.getOption_d());


                char answer = sc.nextLine().charAt(0);
                switch (answer) {
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
                        System.out.println("Incorrect option entered");
                        break;
                 }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // create answerclass object to get final result answerClass.getResult(answer_array)
        AnswerClass answerClass=new AnswerClass();
        String result=answerClass.getResult(answer_array);
        System.out.println("You are a "+result);


    }
}
