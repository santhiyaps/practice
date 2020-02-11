package org.study;

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n>0)
        {
           sum+=n%10;
           prod*=n%10;
           n=n/10;
        }
        return prod-sum;
    }

    public static void main(String[] args) {
        System.out.println(new SubtractProductAndSum().subtractProductAndSum(234));
    }
}
