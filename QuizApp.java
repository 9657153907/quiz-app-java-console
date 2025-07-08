import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizManager manager = new QuizManager();

        System.out.println("Welcome to the Java Quiz App!");
        System.out.print("Enter your name: ");
        String username = scanner.nextLine();

        System.out.println("\nHello, " + username + "! Let's start the quiz.\n");
        int score = 0;
        long startTime = System.currentTimeMillis();

        List<Question> quiz = manager.getQuestions();

        for (int i = 0; i < quiz.size(); i++) {
            Question q = quiz.get(i);
            System.out.println("Q" + (i + 1) + ":");
            q.display();

            System.out.print("Your answer (1-4): ");
            int ans;
            try {
                ans = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Skipping question.");
                scanner.next(); // clear buffer
                continue;
            }

            if (q.isCorrect(ans)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.getCorrectAnswer() + "\n");
            }
        }

        long endTime = System.currentTimeMillis();
        long timeTaken = (endTime - startTime) / 1000;

        System.out.println("Quiz Completed!");
        System.out.println("Name: " + username);
        System.out.println("Score: " + score + "/" + quiz.size());
        System.out.println("Time Taken: " + timeTaken + " seconds");

        if (score == quiz.size()) {
            System.out.println("Excellent! Perfect score.");
        } else if (score >= quiz.size() * 0.7) {
            System.out.println("Great job!");
        } else {
            System.out.println("Keep learning and try again!");
        }
    }
}
