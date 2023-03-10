package collections;
import java.time.LocalDateTime;
import java.util.*;

// Implement the VocabularyWordManager using a SortedSet internally

public class VocabularyWordManager {

    SortedSet<String> sortedSet = new TreeSet<>();

    public VocabularyWordManager(Collection<String> words) {
      sortedSet.addAll(words);
    }

    public String getFirstWord() {
      return sortedSet.first();
    }

    public String getLastWord() {
       return sortedSet.last();

    }

    public SortedSet<String> getWordsBefore(String word) {
       return sortedSet.headSet(word);
    }

    public SortedSet<String> getWordsAfter(String word) {
       return sortedSet.tailSet(word);
    }

    public SortedSet<String> getWordsBetween(String startWord, String endWord) {
       return sortedSet.subSet(startWord,endWord);
    }

    public static void main(String[] args) {
        VocabularyWordManager vocab = new VocabularyWordManager(
                Set.of("apple",
                        "banana",
                        "carrot",
                        "date",
                        "eggplant",
                        "fig",
                        "grape",
                        "honey"));

        System.out.println("First word: " + vocab.getFirstWord());
        System.out.println("Last word: " + vocab.getLastWord());

        String targetWord = "eggplant";
        SortedSet<String> wordsBefore = vocab.getWordsBefore(targetWord);
        System.out.println("Words before " + targetWord + ": " + wordsBefore);

        SortedSet<String> wordsAfter = vocab.getWordsAfter(targetWord);
        System.out.println("Words after " + targetWord + ": " + wordsAfter);

        String startWord = "carrot";
        String endWord = "grape";
        SortedSet<String> wordsBetween = vocab.getWordsBetween(startWord, endWord);
        System.out.println("Words between " + startWord + " and " + endWord + ": " + wordsBetween);
    }
}
