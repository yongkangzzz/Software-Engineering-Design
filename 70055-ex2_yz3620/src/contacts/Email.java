package contacts;

public class Email extends ContactInfo implements TextMessageEnabled{
    public Email(String emailAddress){
        this.contactInfo=emailAddress;
        this.contactInfoType="email";
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
        return;
    }

    @Override
    public void sendTextMessage(String msg) {
        System.out.println(msg);
        System.out.println(contactInfo);
    }
}
