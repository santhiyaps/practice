package org.study;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        boolean isUnique = true;
        HashMap<Integer, Integer> occurMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (occurMap.containsKey(num)) {
                occurMap.put(num, occurMap.get(num) + 1);
            } else
                occurMap.put(num, 1);
        }
        Set<Integer> occurSet = new HashSet();
        for (int i : occurMap.keySet()) {
            if (occurSet.contains(occurMap.get(i)))
                return false;
            else
                occurSet.add(occurMap.get(i));
        }
        return isUnique;
    }

    public static void main(String[] args) {
        System.out.println(new UniqueOccurrences().uniqueOccurrences(new int[]{1, 2}));
    }
}
