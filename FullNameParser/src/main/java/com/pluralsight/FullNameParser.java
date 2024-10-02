package com.pluralsight;
import java.util.*;
public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String formatOne = promptForString("Enter First and Last Name:" );
        String formatTwo = promptForString("Enter First, Middle and Last Name: ");

        System.out.println("First Name: \nLast Name: " + formatOne);
        System.out.println(formatTwo);
        if (formatTwo.isBlank()){
            formatTwo = "none";
        }






    }


        public static String promptForString(String prompt) {

            System.out.print(prompt);
            return scanner.nextLine().trim();
        }
    }