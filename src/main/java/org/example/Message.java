package org.example;

// In class yek message az taraf customer ro namayesh mide.
public class Message {

    // Noe feedback ro negah midare.
    private MessageType type;

    // Matne message customer ro negah midare.
    private String content;

    // Email ferestande ro negah midare.
    private String senderEmail;

    // Constructor baraye sakhtan yek message jadid.
    public Message(MessageType type, String content, String senderEmail) {
        this.type = type;
        this.content = content;
        this.senderEmail = senderEmail;
    }

    public MessageType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getSenderEmail() {
        return senderEmail;
    }
}