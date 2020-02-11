package org.study;

import java.util.Scanner;


/*
 * Create the Encrypter class here.
 */
class Encrypter {
    static String getEncryptedName(String name) {
        String encryptedName = "";
        Validator validator = new Validator();
        if (validator.validate(name)) {
            String a[] = name.split(" ");
            for (int i = a.length - 1; i >= 0; i--) {
                if (encryptedName != "")
                    encryptedName += " ";
                String nme = a[i].toLowerCase();
                for (int j = nme.length() - 1; j >= 0; j--) {
                    encryptedName += nme.charAt(j);
                }

            }

        } else
            throw new IllegalArgumentException("Try again with valid name");

        return encryptedName;
    }
}

class Validator {
    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }

        return true;
    }
}

public class Solution {
    private static final Scanner INPUT_READER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = INPUT_READER.nextLine();

        try {
            System.out.println(Encrypter.getEncryptedName(name));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

