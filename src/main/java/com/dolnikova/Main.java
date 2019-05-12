package com.dolnikova;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter password: ");
        String password = scanner.nextLine();

        System.out.println("Please enter email: ");
        String email = scanner.nextLine();


        if (User.isPasswordRight(password)) {
            System.out.println("Your password is valid");
        } else {
            System.out.println("Your password is not valid");
        }

        if (User.isEmailRight(email)) {
            System.out.println("Your email is valid");
        } else {
            System.out.println("Your email is not valid");
        }
    }
}
