package org.study;

public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int bal=0,answer=0;
        for(Character c:s.toCharArray())
        {
            if(c=='L')
                bal++;
            else
                bal--;
            if(bal==0)
                answer++;

        }
    return answer;
    }

    public static void main(String[] args) {
        System.out.println(new BalancedStringSplit().balancedStringSplit("LLLLRRRR") );
    }
}
