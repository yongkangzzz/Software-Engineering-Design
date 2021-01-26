package contacts;

//Email class extending ContactInfo class, text related work will be implemented
public class Email extends ContactInfo implements TextMessageEnabled {
    public Email(String emailAddress) {
        this.contactInfo = emailAddress;
        this.contactInfoType = "email";
    }

    @Override
    String contactInfo() {
        return contactInfo;
    }

    @Override
    String contactInfoType() {
        return contactInfoType;
    }

    @Override
    void sendMessage(String msg) {
        sendTextMessage(msg);
    }

    @Override
    public void sendTextMessage(String msg) {
        System.out.println(msg);
        try {
            System.out.println(contactInfo);
        } catch (Exception e) {
            System.out.println("Contact Information is invalid!");
        }
    }
}
