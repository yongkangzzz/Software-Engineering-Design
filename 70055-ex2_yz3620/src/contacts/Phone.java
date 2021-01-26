package contacts;

//Phone class extending ContactInfo class and can deal with audio work
public class Phone extends ContactInfo implements AudioMessageEnabled {
  public Phone(String phoneNumber) {
    this.contactInfo = phoneNumber;
    this.contactInfoType = "phone";
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
    Audio newAudio = new Audio(msg);
    sendAudioMessage(newAudio);
  }

  @Override
  public void sendAudioMessage(Audio msg) {
    try {
      System.out.println(msg.toString());
    } catch (Exception e) {
      System.out.println("The audio message is invalid!");
    }
    try {
      System.out.println(contactInfo);
    } catch (Exception e) {
      System.out.println("Contact Information is invalid!");
    }
  }
}
