package org.example;

// In handler feedback haye omoomi customer ro handle mikone.
public class GeneralFeedbackHandler extends FeedbackHandler {

    @Override
    public void handle(Message message) {

        if (message.getType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("General feedback received from: "
                    + message.getSenderEmail());
            System.out.println("Feedback: " + message.getContent());
            System.out.println("Thank you for your feedback.");
        } else {
            handleNext(message);
        }
    }
}