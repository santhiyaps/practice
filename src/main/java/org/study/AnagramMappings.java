package org.study;

import java.util.HashMap;

public class AnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] anaGram = new int[A.length];
        HashMap<Integer, Integer> bMap = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            bMap.put(B[i], i);
        }
        for (int i = 0; i < A.length; i++) {
            anaGram[i] = bMap.get(A[i]);
        }
        return anaGram;
    }

    public static void main(String[] args) {
        System.out.println(new AnagramMappings().anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28}));
    }
}
