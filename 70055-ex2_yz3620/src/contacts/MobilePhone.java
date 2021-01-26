package contacts;

public class MobilePhone extends Phone implements TextMessageEnabled, AudioMessageEnabled {
    public MobilePhone(String phoneNumber) {
        super(phoneNumber);
    }

    @Override
    public void sendTextMessage(String msg) {
        System.out.println(msg);
        System.out.println(contactInfo);
    }

    @Override
    public void sendAudioMessage(Audio msg) {
        super.sendAudioMessage(msg);
    }

    @Override
    void sendMessage(String msg) {
        // System.out.println(msg);
        sendTextMessage(msg);
    }
}
