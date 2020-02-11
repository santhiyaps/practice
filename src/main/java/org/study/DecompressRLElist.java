package org.study;

import java.util.ArrayList;
import java.util.List;

public class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        int i = 0;
        List<Integer> a = new ArrayList();
        while (i < nums.length) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                a.add(val);
            }
            i=i+2;
        }
        int arr[] = new int[a.size()];
        int k = 0;
        for (int in : a) {
            arr[k] = in;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(new DecompressRLElist().decompressRLElist(new int[]{1,2,2,4}));
    }
}
