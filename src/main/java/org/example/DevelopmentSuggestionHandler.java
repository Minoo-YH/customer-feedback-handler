package org.example;

// In handler pishnahad haye development ro handle mikone.
public class DevelopmentSuggestionHandler extends FeedbackHandler {

    @Override
    public void handle(Message message) {

        if (message.getType() == MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Development suggestion received:");
            System.out.println(message.getContent());
            System.out.println("Suggestion logged for future development.");
        } else {
            handleNext(message);
        }
    }
}