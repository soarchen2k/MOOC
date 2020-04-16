package ca.monor.week09.W9_25_DuplicateRemover.tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> unique = new HashSet<String>();
//    private ArrayList<String> duplicated = new ArrayList<String>();
    private int duplicateCounter;

    @Override
    public void add(String characterString) {
//        if (this.unique.contains(characterString) && !this.duplicated.contains(characterString)) {
//            duplicated.add(characterString);
//            duplicateCounter++;
//        } // 在该 String 进入 Set 之前进行判断，是否重复，如该对象已经存在，则是重复
        //  使用该数组可以记录重复的单词
        if (!this.unique.add(characterString)) {  //Set 添加成功后会返回一个 boolean 值，为 true 则添加成功，不成功则计数增加
            duplicateCounter++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicateCounter;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.unique;
    }

    @Override
    public void empty() {
        this.unique.clear();
        duplicateCounter = 0;
    }
}
