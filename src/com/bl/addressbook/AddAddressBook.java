package com.bl.addressbook;

import java.util.Scanner;

public class AddAddressBook {
    Contacts c;
    Scanner sc = new Scanner(System.in);

    public void Add() {
        c = new Contacts();

        System.out.println("Enter First Name : ");
        String firstName = sc.nextLine();

        System.out.println("Enter Last name : ");
        String LastName = sc.nextLine();

        System.out.println("Enter City name : ");
        String cityName = sc.nextLine();

        System.out.println("Enter State name : ");
        String statetName = sc.nextLine();

        System.out.println("Enter pin number : ");
        String pinNumber = sc.nextLine();

        System.out.println("Enter Mobile No : ");
        String mobileNumber = sc.nextLine();

        System.out.println("Enter Email ID : ");
        String EmailID = sc.nextLine();

        c.setFirstName(firstName);
        c.setLastName(LastName);
        c.setCity(cityName);
        c.setState(statetName);
        c.setPin(pinNumber);
        c.setMobileNo(mobileNumber);
        c.setEmail(EmailID);

        System.out.println(c);

    }
}
