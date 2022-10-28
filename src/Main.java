import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Question 1:");
        var fileDestination = "C:/Users/LEGION/Desktop/input.txt";
        FileOrdering.orderFileData(fileDestination);
        System.out.println("Question 2:");
        var words = new String[]{"java", "csharp", "java", "php", "javascript"};
        testQuestionTwo(words);
        System.out.println("Question 3:");
        System.out.println(PerfectSquareCounter.count(13));
    }


    private static void testQuestionTwo(String[] words) {
        for (var word : words) {
            WordCounter.take(word);
        }

        for (var word : words) {
            int count = WordCounter.count(word);
            System.out.println(word + " counted: " + count);
        }
    }
}
