package contacts;

//Abstract class extended by email/phone
public abstract class ContactInfo {
  protected String contactInfo;
  protected String contactInfoType;

  abstract String contactInfo();

  abstract String contactInfoType();

  abstract void sendMessage(String msg);
}
