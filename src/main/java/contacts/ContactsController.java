package main.java.contacts;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;



@RestController
public class ContactsController {

    public ArrayList<Contact> contactsList = ContactFactory.makeContacts();

    @RequestMapping("/contacts")
    public ArrayList<Contact> index() {
        return contactsList;
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public void create(@RequestBody Contact contact){
        contactsList.add(contact);
    }

}
