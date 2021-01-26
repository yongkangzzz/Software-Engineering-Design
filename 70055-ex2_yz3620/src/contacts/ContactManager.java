package contacts;

import java.util.List;
import java.util.ArrayList;

public class ContactManager {
    List<Contact> contacts = new ArrayList<>();

    public void add(Person Person, ContactInfo ContactInfo) {
        Contact newContact = new Contact(Person, ContactInfo);
        contacts.add(newContact);
    }

    public List<ContactInfo> contactDetails(Person Person) {
        List<ContactInfo> contactInfos = new ArrayList<>();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).Person == Person) {
                contactInfos.add(contacts.get(i).ContactInfo);
            }
        }
        return contactInfos;
    }

    void spam(String msg) {
        for (int i = 0; i < contacts.size(); i++) {
            contacts.get(i).ContactInfo.sendMessage(msg);
        }
    }
}

