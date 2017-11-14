package main.java.contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class ContactsController {

    @Autowired
    ContactStorageService contactStorageService;

    @RequestMapping("/contacts")
    public ArrayList<Contact> index() {
        return contactStorageService.getContactsList();
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public void create(@RequestBody Contact contact){
        contactStorageService.add(contact);
    }

}
