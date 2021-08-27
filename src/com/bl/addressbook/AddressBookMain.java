package com.bl.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System ! ");
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        addressBook.getMenu();
    }
}