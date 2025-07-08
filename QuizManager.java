import java.util.*;

public class QuizManager {
    private List<Question> questions;

    public QuizManager() {
        questions = new ArrayList<>();
        loadQuestions();
        Collections.shuffle(questions);
    }

    private void loadQuestions() {
        questions.add(new Question("What are Java loops?", new String[]{"Condition blocks", "Repeating constructs", "Decision makers", "None"}, 1));
        questions.add(new Question("What is an enhanced for-loop?", new String[]{"A type of if-else", "A while loop", "Simplified for array/collection", "None"}, 2));
        questions.add(new Question("What is ArrayList?", new String[]{"Static array", "Map type", "Resizable array", "None"}, 2));
        questions.add(new Question("How to sort a list?", new String[]{"Collections.sort()", "list.sort()", "Array.sort()", "None"}, 0));
        questions.add(new Question("What is a Map in Java?", new String[]{"Set of keys", "Key-value pair structure", "Ordered List", "None"}, 1));
        questions.add(new Question("How to shuffle a list?", new String[]{"list.shuffle()", "Collections.shuffle()", "Math.shuffle()", "None"}, 1));
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
