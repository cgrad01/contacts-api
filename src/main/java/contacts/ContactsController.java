package main.java.contacts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {
    @RequestMapping("/contacts")
    public Contact contact() {
        return new Contact("Corey Grad", "914-263-8399", "104 Suffolk");
    }

}
