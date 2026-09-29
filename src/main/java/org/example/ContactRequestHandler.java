package org.example;

// In handler darkhast haye tamas ro handle mikone.
public class ContactRequestHandler extends FeedbackHandler {

    @Override
    public void handle(Message message) {

        if (message.getType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Contact request received from: "
                    + message.getSenderEmail());
            System.out.println("Request forwarded to customer service.");
        } else {
            handleNext(message);
        }
    }
}