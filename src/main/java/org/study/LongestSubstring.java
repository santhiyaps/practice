package org.study;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0;
        long startTime=System.nanoTime();
        HashSet<Character>charSet=new HashSet<Character>();
        int max=0;
        while(end<s.length())
        {
            if(charSet.contains(s.charAt(end)))
            {
             charSet.remove(s.charAt(start));
             start++;

            }else
            {
               charSet.add(s.charAt(end));
               end++;
               max=Math.max(charSet.size(),max);
            }
        }
        long endTime =System.nanoTime()-startTime;

        System.out.println("Total Time:"+ endTime);
        return max;

    }
    public static void main(String[] args) {
        LongestSubstring longestSubstring=new LongestSubstring();
        System.out.println(longestSubstring.lengthOfLongestSubstring("aabcabcd"));
    }

}
