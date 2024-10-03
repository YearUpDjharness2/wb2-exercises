package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainAlt {

      static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            String nameOfCustomer = PromptForString("What is your name? (Last, First): ");
            String dateAsString = PromptForString("What date will you be coming? (MM/DD/YYYY): ");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate date = LocalDate.parse(dateAsString, formatter);
            int numberOfTickets = Integer.parseInt(PromptForInt("How many tickets would you like?: "));


            if(numberOfTickets == 1) {
                System.out.print(numberOfTickets + " Ticket reserved for ");
            }else {
                System.out.print(numberOfTickets + " Tickets reserved for ");}


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

