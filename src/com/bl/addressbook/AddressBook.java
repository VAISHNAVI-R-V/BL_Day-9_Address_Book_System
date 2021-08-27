package com.bl.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Contacts c;
    Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> contactList = new ArrayList<Contacts>();


    // Method to Add Contacts
    public void Add() {
        // c = new Contacts(firstName, LastName, cityName, statetName, pinNumber, mobileNumber, EmailID);

        System.out.println("Enter First Name : ");
        String firstName = sc.nextLine();

        System.out.println("Enter Last name : ");
        String LastName = sc.nextLine();

        System.out.println("Enter City name : ");
        String cityName = sc.nextLine();

        System.out.println("Enter State name : ");
        String stateName = sc.nextLine();

        System.out.println("Enter pin number : ");
        String pinNumber = sc.nextLine();

        System.out.println("Enter Mobile No : ");
        String mobileNumber = sc.nextLine();

        System.out.println("Enter Email ID : ");
        String EmailID = sc.nextLine();

        // To Set Details for Contacts
//        c.setFirstName(firstName);
//        c.setLastName(LastName);
//        c.setCity(cityName);
//        c.setState(statetName);
//        c.setPin(pinNumber);
//        c.setMobileNo(mobileNumber);
//        c.setEmail(EmailID);

        // used ArrayList to store
        contactList.add(new Contacts(firstName, LastName, cityName,
                stateName, pinNumber, mobileNumber, EmailID));
        System.out.println(contactList);
    }

    // Method to Edit Contacts
    public void Edit() {
        System.out.println("Enter First Name of a Person to Edit:  ");
        String editName = sc.nextLine();

        if (contactList.isEmpty()) {
            System.out.println("Address Book is Empty! ");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String name = contactList.get(i).getFirstName();
                if (editName.equalsIgnoreCase(name)) {
                    System.out.println("Enter first name : ");
                    String firstName = sc.next();
                    System.out.print("Enter New Last Name: ");
                    String lastName = sc.next();
                    System.out.print("Enter New City: ");
                    String city = sc.next();
                    System.out.print("Enter New State: ");
                    String state = sc.next();
                    System.out.print("Enter New Zip Code of area: ");
                    String zipCode = sc.next();
                    System.out.print("Enter New Mobile Number: ");
                    String mobileNo = sc.next();
                    System.out.print("Enter New Email Id: ");
                    String email = sc.next();

                    contactList.get(i).setFirstName(firstName);
                    contactList.get(i).setLastName(lastName);
                    contactList.get(i).setCity(city);
                    contactList.get(i).setState(state);
                    contactList.get(i).setPin(zipCode);
                    contactList.get(i).setMobileNo(mobileNo);
                    contactList.get(i).setEmail(email);
                    System.out.println("Contacts Updated! ");
                } else {
                    System.out.println("Name not Found!!");
                }
            }
            System.out.println(contactList);
        }
//        if (editName.equalsIgnoreCase(c.firstName)) {
//            Add();
//        } else {
//            System.out.println("Invalid First Name! ");
//            System.out.println("Please Enter Valid First Name: ");
//            Edit()
//        }
    }

    // method to delete contact
    public void Delete() {
        System.out.println("Enter First Name of a Person to Delete:  ");
        String deleteName = sc.nextLine();

        if (contactList.isEmpty()) {
            System.out.println("The AddressBook is Empty....!");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                String matcher = contactList.get(i).getFirstName();
                if (matcher.equalsIgnoreCase(deleteName)) {
                    contactList.remove(i);
                    System.out.println("Contact Deleted Successfully...");
                } else {
                    System.out.println("Name Not Found! ");
                }
            }
            System.out.println(contactList);

        }
    }

    public void showContact() {

        System.out.println("Number of Contacts Stored in " + contactList.size());
        if (contactList.isEmpty()) {
            System.out.println("There is No Contact Available");
        } else {
            for (int i = 0; i < contactList.size(); i++) {
                System.out.println(contactList.get(i));
            }
        }
    }

    public void getMenu() {
        System.out.println("------------------Menu For AddressBooK------------------");

        boolean exit = false;
        do {
            System.out.println("Choose Option from below \n1. Add Contacts \n2. " +
                    "Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
            System.out.print("->:");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    Add();
                    System.out.println("Contact added successfully....");
                    break;
                case 2:
                    Edit();
                    System.out.println("Contact edited successfully....");
                    break;
                case 3:
                    Delete();
                    break;
                case 4:
                    showContact();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Please Choose Valid Option! ");
                    break;

            }
        } while (!exit);
    }
}
