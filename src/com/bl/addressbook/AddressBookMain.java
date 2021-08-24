package com.bl.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    // main method
        public static void main(String[] args) {
            System.out.println("Welcome to Address Book System ! ");
            Scanner sc = new Scanner(System.in);
            AddressBook addressBook = new AddressBook();
            addressBook.Add();

            //Asking Edit Option to User
            System.out.println("Do You Want To Edit ContactS?? ");
            System.out.println("Enter Y/y to edit ");
            String op = sc.nextLine();

            if(op.equals("y") || op.equals("Y")){
                System.out.println("You have Entered following data");
                addressBook.Edit();
                System.out.println("Thank for Using Address book");
            } else {
                System.out.println("Thanks for using! ");
            }
        }
}
