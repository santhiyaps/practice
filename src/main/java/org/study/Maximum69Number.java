package org.study;

public class Maximum69Number {
    public int maximum69Number(int num) {
        String numStr = String.valueOf(num);
        numStr = numStr.replaceFirst("6", "9");
        int result = Integer.parseInt(numStr);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Maximum69Number().maximum69Number(9669));

    }
}
