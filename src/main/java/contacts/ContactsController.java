package main.java.contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactsController {

    @Autowired
    private ContactRepository contactRepository;

    @RequestMapping("/contacts")
    public Iterable<Contact> index() {
        return contactRepository.findAll();
    }

    @RequestMapping(value = "/contact", method = RequestMethod.POST)
    public @ResponseBody String create(@RequestBody Contact contact){
        contactRepository.save(contact);
        return "Saved";
    }

}
