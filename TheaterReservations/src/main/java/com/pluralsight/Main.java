package com.pluralsight;
import java.util.*;
public class Main {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int numberOfTickets = Integer.parseInt(PromptForInt("How many tickets would you like?: "));
        String date = PromptForString("What date will you be coming? (DD/MM/YYY): ");
        String nameOfCustomer = PromptForString("What is your name?: ");

        System.out.print(numberOfTickets + " Tickets Reserved for ");
        System.out.print(date);
        System.out.print(" Under " + nameOfCustomer);
    }
    public static String PromptForInt(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}