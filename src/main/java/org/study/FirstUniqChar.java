package org.study;

import java.util.*;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> charMap=new LinkedHashMap<>();
        for(char c:s.toCharArray())
        {
            if(charMap.containsKey(c))
            {
               charMap.put(c,charMap.get(c)+1);
            }else
            {
               charMap.put(c,1);
            }
        }

        for(char c:charMap.keySet())
        {
            if(charMap.get(c)==1)
                return s.indexOf(c);
        }
        return -1;
    }
    public int firstUniqChar1(String s) {

       Set<Character> charSet=new HashSet<>();
       List<Character>nonRepatingList=new ArrayList<>();
        for(char c:s.toCharArray())
        {
           if(charSet.contains(c))
           {
               if(nonRepatingList.contains(c))
               {
                   nonRepatingList.remove((Character) c);
               }
           }
          else
           {
               charSet.add(c);
               nonRepatingList.add(c);
           }
        }
        if(nonRepatingList.isEmpty())
            return -1;
        else
            return s.indexOf(nonRepatingList.get(0));

    }

    public static void main(String[] args) {
        System.out.println(new FirstUniqChar().firstUniqChar("loveleetcode"));
        System.out.println(new FirstUniqChar().firstUniqChar1("loveleetcode"));
    }
}
