package org.study;

import java.util.HashMap;

public class TwoSumLessThanK {
    public int twoSumLessThanK(int[] A, int K) {
        HashMap<Integer, Integer> aMAp = new HashMap<>();
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < K) {
                if (aMAp.isEmpty())
                    aMAp.put(i, A[i]);
                else {
                    for (int j : aMAp.keySet()) {
                        if (A[i] + aMAp.get(j) < K) {
                            max = Math.max(max, A[i] + aMAp.get(j));
                        }

                    }
                    aMAp.put(i, A[i]);
                }
            }

        }
        if (max == 0) return -1;
        return max;
    }


    public static void main(String[] args) {
        System.out.println(new TwoSumLessThanK().twoSumLessThanK(new int[]{254, 914, 110, 900, 147, 441, 209, 122, 571, 942, 136, 350, 160, 127, 178, 839, 201, 386, 462, 45, 735, 467, 153, 415, 875, 282, 204, 534, 639, 994, 284, 320, 865, 468, 1, 838, 275, 370, 295, 574, 309, 268, 415, 385, 786, 62, 359, 78, 854, 944}
                , 200));
    }
}
