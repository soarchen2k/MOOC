package ca.monor.week09.W9_24_MultipleEntryDictionary.dictionary;

import java.util.Set;

public interface MultipleEntryDictionary {
    void add(String word, String entry);
    Set<String> translate(String word);
    void remove(String word);
}