package ro.mirodone;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        try {

            File f = new File("C:\\Users\\euL\\IdeaProjects\\CodingExercisesDay029\\src\\ro\\mirodone\\andrii.txt");
            Scanner sc;
            sc = new Scanner(f);
            // sc.useDelimiter("[^a-zA-Z']+");
            Map<String, Integer> wordCount = new TreeMap<>();
            while(sc.hasNext()) {
                String word = sc.next();
                if(!wordCount.containsKey(word))
                    wordCount.put(word, 1);
                else
                    wordCount.put(word, wordCount.get(word) + 1);
            }

            // show results
            for(String word : wordCount.keySet())
                System.out.println(word + " " + wordCount.get(word));
            System.out.println(wordCount.size());
        }
        catch(
                IOException e) {
            System.out.println("Unable to read from file.");
        }

    }
}
