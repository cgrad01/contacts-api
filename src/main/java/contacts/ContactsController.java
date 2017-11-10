package main.java.contacts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ContactsController {
    @RequestMapping("/contacts")
    public ArrayList<Contact> contacts() {
        return ContactFactory.makeContacts();
    }

}
