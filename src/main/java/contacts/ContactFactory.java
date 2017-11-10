package main.java.contacts;

import java.util.ArrayList;

public class ContactFactory {

    public static ArrayList<Contact> makeContacts(){
        ArrayList<Contact> contactList = new ArrayList<>();
        int lastFourOfPhone = 3421;
        String defaultName = "Corey Grad";
        int addressNumber = 111;
        for (int i = 0; i < 20; i++) {
            lastFourOfPhone += i;
            addressNumber += i;
            contactList.add(new Contact(defaultName, "914-263-"+lastFourOfPhone, addressNumber + " Main St."));
        }
        return contactList;
    }
}
