package PrototypePattern;

public class EmailService implements Copiable<EmailService> {
    private String data;
    private final String subject;
    private final String recipient;

    // expensive constructor — called once
    public EmailService(String subject, String recipient) {
        this.subject = subject;
        this.recipient = recipient;
        this.data = "feteched from db"; // expensive operation
    } 

    public EmailService(EmailService eml){
        this.data = eml.data;
        this.recipient = eml.recipient;
        this.subject = eml.subject;
    }

    @Override
    public EmailService copy(){
        return new EmailService(this);
    }


}


