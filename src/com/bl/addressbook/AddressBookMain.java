package com.bl.addressbook;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressBookMain {
    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System ! ");
        Scanner sc = new Scanner(System.in);
        Map<String,AddressBook> addressbookHashMap = new HashMap<String, AddressBook>();
        AddressBook addressBook = new AddressBook();
       // addressBook.getMenu();
        while (true) {
            System.out.println("\n--------------------------Welcome to Address Book System--------------------------");
            System.out.println("1. New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Delete Address Book");
            System.out.println("4. Exit");
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name of new Address Book: ");
                    String bookName = sc.next();
                    sc.nextLine();
                    addressbookHashMap.put(bookName, addressBook);//adding bookname as a key and value is allocating memory for addressbook obj
                    addressBook.getMenu(addressbookHashMap.get(bookName));//call addressbookoption method with passing key of hashmap
                    break;
                case 2:
                    System.out.println("List of available Address Book : ");
                    Set keys = addressbookHashMap.keySet();//retrived keys from hashmap to show addressbooklist
                    Iterator i = keys.iterator();
                    while (i.hasNext()){
                        System.out.println(i.next());
                    }
                    System.out.println("Enter Address Book name you want to Open : ");
                    String name = sc.nextLine();
                    System.out.println("Current Address Book is : "+name);
                    addressBook.getMenu(addressbookHashMap.get(name));//call method with passing address book name
                    break;
                case 3:
                    System.out.println("Enter Address Book name to be delete: ");
                    name = sc.nextLine();
                    addressbookHashMap.remove(name);//delete hashmap using remove fun
                    break;
                case 4:
                    sc.close();//for closing the programme
                    return;
                default:
                    System.out.println("You Entered Invalid Choice....!");
                    break;
            }
        }
    }
}