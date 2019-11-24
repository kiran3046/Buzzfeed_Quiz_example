package BuzzfeedQuiz;

public class QuestionClass {
    private String question_text;
    private String option_a;
    private String option_b;
    private String option_c;
    private String option_d;

    //constructor to initialize a Question with question text and four options
    public QuestionClass(String question_text, String option_a, String option_b, String option_c, String option_d) {
        this.question_text = question_text;
        this.option_a = option_a;
        this.option_b = option_b;
        this.option_c = option_c;
        this.option_d = option_d;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public String getOption_a() {
        return option_a;
    }

    public String getOption_b() {
        return option_b;
    }

    public String getOption_c() {
        return option_c;
    }

    public String getOption_d() {
        return option_d;
    }
}
