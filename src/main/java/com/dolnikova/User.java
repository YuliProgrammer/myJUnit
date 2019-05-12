package com.dolnikova;

public class User {
    private String password;
    private String email;

    public static boolean isPasswordRight(String password) {
        if (password.equals(password.toLowerCase()) || password.equals(password.toUpperCase()) || password.contains(" ") ||
                !password.contains("_") && !password.contains("!") && !password.contains("?") && !password.contains("&")) {
            return false;
        }

        if (isContainsNum(password) == false || isContainsCyrillic(password) == true) {
            return false;
        }

        return password.length() >= 8 && password.length() <= 20;
    }

    public static boolean isEmailRight(String email) {
        if (isContainsNum(email) == true || isContainsCyrillic(email) == true || email.contains(" ")) {
            return false;
        }

        int countOfAmpersand = 0;
        for (int i = 0; i < email.length(); i++) {
            if (countOfAmpersand >= 2) {
                break;
            } else {
                if (email.charAt(i) == '@') {
                    countOfAmpersand++;
                }
            }
        }

        if (countOfAmpersand == 0 || countOfAmpersand > 1 || !email.contains(".")) {
            return false;
        }

        return email.length() >= 8 && email.length() <= 20;
    }

    private static boolean isContainsNum(String string) {
        boolean isNumContains = false;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                isNumContains = true;
                break;
            }
        }

        return isNumContains;
    }

    private static boolean isContainsCyrillic(String string) {
        boolean isCyrillicContains = false;
        for (int i = 0; i < string.length(); i++) {
            String s = Character.toString(string.charAt(i));
            if (Character.isLetter(string.charAt(i)) && !s.matches("\\p{IsLatin}")) {
                isCyrillicContains = true;
                break;
            }
        }

        return isCyrillicContains;
    }
}
