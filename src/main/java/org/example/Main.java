package org.example;

public class Main {

    public static void main(String[] args) {

        // Handler haye mokhtalef ro misazim.
        FeedbackHandler compensationHandler = new CompensationHandler();
        FeedbackHandler contactHandler = new ContactRequestHandler();
        FeedbackHandler developmentHandler = new DevelopmentSuggestionHandler();
        FeedbackHandler generalHandler = new GeneralFeedbackHandler();

        // Handler ha ro be ham vasl mikonim ta chain sakhte beshe.
        compensationHandler
                .setNextHandler(contactHandler)
                .setNextHandler(developmentHandler)
                .setNextHandler(generalHandler);

        // Chand message mokhtalef baraye test misazim.
        Message message1 = new Message(
                MessageType.COMPENSATION_CLAIM,
                "I want compensation for my damaged product.",
                "customer1@email.com"
        );

        Message message2 = new Message(
                MessageType.CONTACT_REQUEST,
                "Please contact me about my order.",
                "customer2@email.com"
        );

        Message message3 = new Message(
                MessageType.DEVELOPMENT_SUGGESTION,
                "It would be useful to have a dark mode.",
                "customer3@email.com"
        );

        Message message4 = new Message(
                MessageType.GENERAL_FEEDBACK,
                "I am happy with the service.",
                "customer4@email.com"
        );

        // Hame message ha ro az avalin handler chain mifrestim.
        compensationHandler.handle(message1);
        System.out.println();

        compensationHandler.handle(message2);
        System.out.println();

        compensationHandler.handle(message3);
        System.out.println();

        compensationHandler.handle(message4);
    }
}