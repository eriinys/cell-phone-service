package com.pluralsight;

import java.util.*;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //FIRST PHONE
        CellPhone cellPhone1 = new CellPhone();

        //user prompt
        System.out.println("What is the serial number? (numbers only): ");
        cellPhone1.setSerialNumber(myScanner.nextInt());
        myScanner.nextLine();

        System.out.println("What model is the phone?: ");
        cellPhone1.setModel(myScanner.nextLine());

        System.out.println("Who is the carrier?: ");
        cellPhone1.setCarrier(myScanner.nextLine());

        System.out.println("What is the phone number?: ");
        cellPhone1.setPhoneNumber(myScanner.nextLine());

        System.out.println("Who is the owner of the phone?: ");
        cellPhone1.setOwner(myScanner.nextLine());

        //SECOND PHONE
        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setPhoneNumber("855-555-2222");

        //THIRD PHONE
        CellPhone cellPhone3 = new CellPhone("Dave", "555-555-5550");

        //Displaying both phones
        System.out.println("\nPhone 1: ");
        display1(cellPhone1);
        System.out.println("\nPhone 2: ");
        display2(cellPhone2);
        System.out.println("\nPhone 3: ");
        display3(cellPhone3);

        //Dial
        cellPhone1.dial(cellPhone2);
        cellPhone2.dial(cellPhone1);
        cellPhone3.dial(cellPhone2);

    }

        //display output
    public static void display1(CellPhone cellPhone1) {
        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());
    }

    public static void  display2(CellPhone cellPhone2) {
        System.out.println("Phone Number: " + cellPhone2.getPhoneNumber());
    }

    public static void display3(CellPhone cellPhone3) {
        System.out.printf("Owner: %s", cellPhone3.getOwner());
        System.out.printf("\nPhone Number: %s", cellPhone3.getPhoneNumber() + "\n");
    }


}