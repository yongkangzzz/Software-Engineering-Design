package contacts;

//Class combining person and contact information
public class Contact {
    Person Person;
    ContactInfo ContactInfo;

    public Contact(Person Person, ContactInfo ContactInfo) {
        this.Person = Person;
        this.ContactInfo = ContactInfo;
    }
}
