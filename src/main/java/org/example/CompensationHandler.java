package org.example;

// In handler message haye compensation claim ro handle mikone.
public class CompensationHandler extends FeedbackHandler {

    @Override
    public void handle(Message message) {

        if (message.getType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Compensation claim received from: "
                    + message.getSenderEmail());
            System.out.println("Claim is being reviewed.");
        } else {
            // Agar message marboot be in handler nabashe,
            // be handler badi ferestade mishe.
            handleNext(message);
        }
    }
}