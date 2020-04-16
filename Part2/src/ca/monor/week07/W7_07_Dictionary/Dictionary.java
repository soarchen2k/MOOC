package ca.monor.week07.W7_07_Dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary = new HashMap<String, String>();

    public String translate(String word) {
        if (this.dictionary.containsKey(cleanString(word))) {
            return this.dictionary.get(cleanString(word));
        }
        return null;
    }

    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
    public String cleanString(String word) {
        word = word.toLowerCase();
        return word.trim();
    }

    public int amountOfWords() {
        return this.dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> wordList = new ArrayList<String>();
        for (String key :
                dictionary.keySet()) {
            wordList.add(key + " = " + dictionary.get(key));
        }
        return wordList;
    }
}
