package contacts;

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
        return;
    }

    @Override
    public void sendAudioMessage(Audio msg) {
        System.out.println(msg.toString());
        System.out.println(contactInfo);
    }
}
