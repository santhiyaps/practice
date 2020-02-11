package org.study;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveVowels {
    public String removeVowels(String s) {
        String newStr = "";
        HashSet <Character>vowelSet = new HashSet<Character>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        int start = 0;
        while (start < s.length()) {
            if (!(vowelSet.contains(s.charAt(start)))) {
                newStr += s.charAt(start);
            }
            start++;
        }
        return newStr;
    }

    public static void main(String[] args) {
        RemoveVowels removeVowels = new RemoveVowels();
        System.out.println(removeVowels.removeVowels("leetcode"));
    }
}
