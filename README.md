# Customer Feedback Handler

This project is a simple Java program for handling different types of customer feedback.

I used the Chain of Responsibility pattern. The idea is that a message goes through different handlers until it finds the correct handler.

The program has four types of feedback:

- Compensation claim
- Contact request
- Development suggestion
- General feedback

Each feedback type has its own handler.

## How it works

First, the handlers are connected together to create a chain.

```text
CompensationHandler
        ↓
ContactRequestHandler
        ↓
DevelopmentSuggestionHandler
        ↓
GeneralFeedbackHandler
```

When a message is sent, it starts from the first handler.

The handler checks the message type. If it can handle the message, it processes it. If not, it sends the message to the next handler in the chain.

For example, if the message is a development suggestion, it first goes to the compensation handler and contact request handler. They cannot handle it, so it continues until it reaches the development suggestion handler.

## Message

Each message contains:

- Message type
- Message content
- Sender email

I used an enum called `MessageType` for the different message types.

## Testing

In the `Main` class I created different messages to test the program. Each message is sent through the same handler chain and is handled by the correct handler.
