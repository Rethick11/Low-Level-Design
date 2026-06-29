package PrototypePattern;

public class AdvanceEmail extends EmailService {
    private String cc;
    private String bc;

    public AdvanceEmail(String subject, String recipient, String cc, String bc) {
        super(subject, recipient );
        this.cc = cc;
        this.bc = bc;
        
    } 

    public AdvanceEmail(AdvanceEmail aeml){
        super(aeml);
        this.cc = aeml.cc;
        this.bc = aeml.bc;
    }

    
    public AdvanceEmail copy() {
        return new AdvanceEmail(this);
    }

    
}
