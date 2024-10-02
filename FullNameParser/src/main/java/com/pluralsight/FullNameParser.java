package com.pluralsight;
import java.util.*;
public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String formatOne = PromptForString("Enter First, Last: ");
        String formatTwo = PromptForString("Enter First, Middle, Last: ");


        public static String PromptForString (String prompt);
        {
            System.out.print(prompt);
            return scanner.nextLine().trim();
        }

    }
}