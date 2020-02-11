package org.study;

import java.util.Scanner;

class Parser {
    boolean isBalanced(String brack) {
        int i = 0;
        char prev='\0';
        for (char c : brack.toCharArray()) {
            if(c=='{'|| c=='(') {
                i++;
                prev=c;
            }
            else if(c=='}'|| c==')') {
                if(prev=='\0')
                {
                    return false;
                }
                i--;
            }
        }
        if(i==0)
            return true;
        else
            return false;
    }

}

// Write your code here. DO NOT use an access modifier in your class declaration.
public class Solution1{

    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }
}
