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

    public static void mobile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Mobile Number With Country Code(space between code and number)");
        String m = sc.nextLine();
        if (Pattern.matches("^[1-9]{2}\s{1}[6-9]{1}[0-9]{9}$", m) == true)
            System.out.println("Valid Mobile Number");
        else
            System.out.println("Invalid Mobile Number");
    }

    // Ability to add password
    // Rule 4 should have exactly  1 special character

    public static void password() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("\nEnter the Password");
        String p = sc.nextLine();
        if (Pattern.matches("^[A-Za-z0-9]{8,}[.+_!@#$%^&*]{1}$", p) == true) //should have 1 special character
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
    public static void main(String[] args) {
        firstName();
        lastName();
        email();
        mobile();
        password();
    }
}
