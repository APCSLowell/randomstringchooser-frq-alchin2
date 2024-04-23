import java.util.*;

public class RandomStringChooser {
    private ArrayList<String> words;

    public RandomStringChooser(String[] array) {
        words = new ArrayList<String>();
        for (String word : array) {
            words.add(word);
        }
    }

    public String getNext() {
        if (words.size() > 0) {
            int randomIndex = (int) (Math.random() * words.size());
            return words.remove(randomIndex);
        }
        return "NONE";
    }
}
