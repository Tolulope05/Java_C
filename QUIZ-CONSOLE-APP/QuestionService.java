import java.util.Random;
import java.util.Scanner;

public class QuestionService {
    // int id[];
    // String question[];
    // String opt[];

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Which language is platform independent?", "Java", "C++", "Python", "C#",
                "Java");
        questions[1] = new Question(2, "Which keyword is used to create a class in Java?", "class", "Class", "struct",
                "object", "class");
        questions[2] = new Question(3, "Which method starts a Java program?", "start()", "main()", "run()", "execute()",
                "main()");
        questions[3] = new Question(4, "Which symbol ends a Java statement?", ".", ",", ";", ":", ";");
        questions[4] = new Question(5, "Which data type stores true or false?", "int", "String", "boolean", "char",
                "boolean");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no. :" + q.getId());
            System.out.println(q.getQuestion());
            // GET THE OPTION
            System.out.println("A. " + q.getOpt1());
            System.out.println("B. " + q.getOpt2());
            System.out.println("C. " + q.getOpt3());
            System.out.println("D. " + q.getOpt4());
            // GET INPUT FROM SOURCE
            // SCANNER HELPS GET VALUE
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void displayQuestion2() {
        Random random = new Random();
        int randomIndex = random.nextInt(questions.length);
        Question question = questions[randomIndex];

        System.out.println(question.getQuestion());
        System.out.println(question.getOpt1());
        System.out.println(question.getOpt2());
        System.out.println(question.getOpt3());
        System.out.println(question.getOpt4());
    }

}
