package contacts;

//Class combining person and contact information
public class Contact {
  Person person;
  ContactInfo contactInfo;

  public Contact(Person person, ContactInfo contactInfo) {
    this.person = person;
    this.contactInfo = contactInfo;
  }
}
