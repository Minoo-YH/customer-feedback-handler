package org.example;

// In class paye baraye tamame handler ha hast.
// Har handler mitone message ro handle kone ya be handler badi befrest.
public abstract class FeedbackHandler {

    // Handler badi dar chain.
    protected FeedbackHandler nextHandler;

    // Handler badi ro moshakhas mikone.
    public FeedbackHandler setNextHandler(FeedbackHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    // Har handler bayad moshakhas kone chetor message ro handle mikone.
    public abstract void handle(Message message);

    // Agar handler feli natone message ro handle kone,
    // message ro be handler badi mifreste.
    protected void handleNext(Message message) {
        if (nextHandler != null) {
            nextHandler.handle(message);
        } else {
            System.out.println("No handler found for this message.");
        }
    }
}