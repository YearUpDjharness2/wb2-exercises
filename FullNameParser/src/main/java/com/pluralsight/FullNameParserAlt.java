package com.pluralsight;
import java.util.*;
public class FullNameParserAlt {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String fullName = PromptForString("Please Enter Full Name: ");



        int indexOfFirstSpace = fullName.indexOf(' ');


        String firstName = fullName.substring(0, indexOfFirstSpace);

        String endingpart = fullName.substring(indexOfFirstSpace + 1);

        int indexOfEndingPart = endingpart.indexOf(" ");

        String middleName = " ";
        String lastName = " ";

        if(indexOfEndingPart < 0){
            lastName = endingpart;
        }
        else{
            middleName = endingpart.substring(0, indexOfEndingPart);
            lastName = endingpart.substring(indexOfEndingPart + 1);
        }






        System.out.println("First Name: " + firstName);
        System.out.println("endingpart " + endingpart);

        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);


    }


    public static String PromptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}