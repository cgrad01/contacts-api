package main.java.contacts;

import org.springframework.web.bind.annotation.RequestBody;

public class Contact {
    private String name;
    private String number;
    private String address;

    public Contact(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public Contact() {}

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }
}
