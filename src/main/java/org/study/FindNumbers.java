package org.study;

public class FindNumbers {
    public int findNumbers(int[] nums) {
        int num = 0;
        for (int n : nums) {
            int count = 0;
            while (n > 0) {
                n = n / 10;
                count++;
            }
            if (count % 2 == 0) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new FindNumbers().findNumbers(new int[]{12, 345, 2, 6, 7896}));
    }
}
