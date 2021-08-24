package com.bl.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System ! ");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        addressBook.Add();

        //Asking Edit or Delete Option to User
        System.out.println("Enter 1 . Edit \n 2 . Delete \n press any key for exit");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                addressBook.Edit();
                System.out.println("Thank for Using Address book");
                break;
            case 2:
                addressBook.Delete();
                break;
        }
    }
}