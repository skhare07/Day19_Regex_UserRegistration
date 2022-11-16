package com.bridgelabz.regex_user_registration;

// Ability to add first and last name and checking if it is valid or not

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationRegex {
    static Scanner sc = new Scanner(System.in);

    public static void firstName() {
        System.out.println("Enter First Name");
        String fN = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
    }

    //ability to add email and checking if it is valid
    public static void lastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Last Name");
        String lN = sc.nextLine();
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true)
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");
    }

    public static void email() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Email");
        String email = sc.nextLine();
        if (Pattern.matches("^[a-z]{1,}[._+-]?[a-z]{1,}?[\\@][a-z]{1,}[\\.][a-z]{1,}[\\.][a-z]{1,}$",email) == true)
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }

    public static void main(String[] args) {
        firstName();
        lastName();
        email();
    }
}
