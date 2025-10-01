package com.pluralsight;

import java.util.*;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        CellPhone myPhone = new CellPhone();

        //user prompt
        System.out.println("What is the serial number?: ");
        myPhone.setSerialNumber(myScanner.nextInt());
        myScanner.nextLine();

        System.out.println("What model is the phone?: ");
        myPhone.setModel(myScanner.nextLine());

        System.out.println("Who is the carrier?: ");
        myPhone.setCarrier(myScanner.nextLine());

        System.out.println("What is the phone number?: ");
        myPhone.setPhoneNumber(myScanner.nextLine());

        System.out.println("Who is the owner of the phone?: ");
        myPhone.setOwner(myScanner.nextLine());

        //display output
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());
    }
}