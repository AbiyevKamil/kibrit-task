import java.io.*;
import java.util.Collections;
import java.util.UUID;
import java.util.stream.Collectors;


public class FileOrdering {
    public static void orderFileData(String inputFilePath) throws IOException {
        var inputFile = new File(inputFilePath);
        if (!inputFile.exists() || !inputFile.isFile()) {
            System.out.println("File not found.");
            return;
        }
        try (FileReader fileReader = new FileReader(inputFile)) {
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                var lines = bufferedReader.lines();
                var sortedLines = lines.sorted(String::compareToIgnoreCase).collect(Collectors.toList());
                Collections.reverse(sortedLines);
                var sortedFile = new File(getRandomFileName());
                try (FileWriter fileWriter = new FileWriter(sortedFile)) {
                    try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                        for (var line : sortedLines) {
                            bufferedWriter.write(line);
                            bufferedWriter.newLine();
                        }
                    }
                }
            }
        }
    }


    private static String getRandomFileName() {
        return "C:/Users/LEGION/Desktop/" + UUID.randomUUID() + ".txt";
    }
}
