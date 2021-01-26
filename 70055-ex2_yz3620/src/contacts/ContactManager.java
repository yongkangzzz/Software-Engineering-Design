package contacts;

import java.util.List;
import java.util.ArrayList;

//Class of a contact manager
public class ContactManager {
  //A list to store all information about contact
  List<Contact> contacts = new ArrayList<>();

  //Add a new person with his contact information into the list contacts
  public void add(Person person, ContactInfo contactInfo) {
    try {
      Contact newContact = new Contact(person, contactInfo);
      contacts.add(newContact);
    } catch (Exception e) {
      System.out.println("Please provide valid Person and ContactInfo!");
    }
  }

  //Return a list including all contact information about Person(in list contacts)
  public List<ContactInfo> contactDetails(Person person) {
    List<ContactInfo> contactInfos = new ArrayList<>();
    try {
      int flag = 0; //Mark whether this Person has been found
      for (int i = 0; i < contacts.size(); i++) {
        if (contacts.get(i).person == person) {
          contactInfos.add(contacts.get(i).contactInfo);
          flag = 1;
        }
      }
      if (flag == 0) {
        System.out.println("This Person has not been found in contacts!");
      }
    } catch (Exception e) {
      System.out.println("Please check whether Person and contacts is invalid!");
    }
    return contactInfos;
  }

  //Send spam message msg to all contact
  void spam(String msg) {
    for (int i = 0; i < contacts.size(); i++) {
      contacts.get(i).contactInfo.sendMessage(msg);
    }
  }
}

