package org.study;

public class ToLowerCase {
    public String toLowerCase(String str) {
        String newString="";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 65 && str.charAt(i) < 90) {
                int j='0';
                j=str.charAt(i)+32;
                newString+=(char)j;
            } else {
                newString+=str.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(new ToLowerCase().toLowerCase("Hello"));
    }
}
