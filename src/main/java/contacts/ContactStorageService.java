package main.java.contacts;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactStorageService {

    private ArrayList<Contact> contactsList;

    public ContactStorageService(){
        contactsList = new ArrayList<>();
        setContactsList(ContactFactory.makeContacts());
    }

    public void setContactsList(List<Contact> listOfContacts){
        contactsList.addAll(listOfContacts);
    }

    public void add(Contact newContact){
        contactsList.add(newContact);
    }

    public ArrayList<Contact> getContactsList(){
        return contactsList;
    }
}
