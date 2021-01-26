package contacts;

public abstract class ContactInfo {
    protected String contactInfo;
    protected String contactInfoType;

    abstract String contactInfo();

    abstract String contactInfoType();

    abstract void sendMessage(String msg);
}
