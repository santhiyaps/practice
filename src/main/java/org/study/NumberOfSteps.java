package org.study;

public class NumberOfSteps {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num >0) {
            if (num % 2 == 0) {
                num = num / 2;
                steps++;
            } else {
                num = num - 1;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfSteps().numberOfSteps(14));
    }
}
