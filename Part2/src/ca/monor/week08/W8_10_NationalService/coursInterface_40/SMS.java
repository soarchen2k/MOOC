package ca.monor.week08.W8_10_NationalService.coursInterface_40;

public class SMS implements Readable {

    private String sender;
    private String content;

    public SMS(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    public String read() {
        return this.content;
    }

    @Override
    public String toString() {
        return "From: " + sender + "\n" + "Message: " + content;
    }

}
