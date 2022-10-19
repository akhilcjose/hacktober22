import java.io.*;
import java.util.HashSet;

//Finds unique words in a text file using Hashset
public class UniqueWords {
    public static void main(String[] args) throws Exception {
        String line;
        FileReader file = new FileReader("src/main/resources/file.txt");
        BufferedReader br = new BufferedReader(file);
        HashSet<String> uniqueWords = new HashSet<>();
        while ((line = br.readLine()) != null) {
            String[] wordsArray = line.toLowerCase().split("\\W");
            for(String word : wordsArray)
            {
                uniqueWords.add(word);
            }
        }
        br.close();

        for (String s : uniqueWords)
            System.out.println(s);
    }
}
