package org.study;

public class DefangIp {
    public String defangIPaddr(String address) {
        int i=0;
        String newString="";
        while(i<address.length())
        {
            if(address.charAt(i)=='.')
                newString+="[.]";
            else
                newString+=address.charAt(i);
        i++;
        }
        return newString;

    }

    public static void main(String[] args) {
        System.out.println(new DefangIp().defangIPaddr("1.1.1.1"));
    }
}
