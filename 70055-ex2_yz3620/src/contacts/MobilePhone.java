package contacts;

//Mobile phone class extending phone class and can deal with text and audio work
public class MobilePhone extends Phone implements TextMessageEnabled, AudioMessageEnabled {
    public MobilePhone(String phoneNumber) {
        super(phoneNumber);
    }

    @Override
    //Deal with text work like email
    public void sendTextMessage(String msg) {
        System.out.println(msg);
        try {
            System.out.println(contactInfo);
        } catch (Exception e) {
            System.out.println("Contact Information is invalid!");
        }
    }

    @Override
    //Deal with audio work like phone
    public void sendAudioMessage(Audio msg) {
        super.sendAudioMessage(msg);
    }

    @Override
    void sendMessage(String msg) {
        sendTextMessage(msg);
    }
}
