package org.study;

import java.util.HashSet;

public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        int jewelCount=0;
        final HashSet<Character>charSet=new HashSet<Character>();
        J.chars().forEach(e->charSet.add((char)e));
        for(Character c: S.toCharArray())
        {
            if(charSet.contains(c))
                jewelCount++;
        }
        return jewelCount;
    }

    public static void main(String[] args) {
        System.out.println(new NumJewelsInStones().numJewelsInStones("aA","aAAbbbb"));

    }

}
