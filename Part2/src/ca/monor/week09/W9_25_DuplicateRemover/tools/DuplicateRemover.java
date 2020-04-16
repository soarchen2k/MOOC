package ca.monor.week09.W9_25_DuplicateRemover.tools;

import java.util.Set;

public interface DuplicateRemover {
    void add(String characterString);
    int getNumberOfDetectedDuplicates();
    Set<String> getUniqueCharacterStrings();
    void empty();
}