package com.inheritance;
import java.time.LocalDateTime;



public class Notification {

    public Notification(String subject, String body) {
        this.status = "Default";
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        printText();
    }

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public void showStatus(){
        System.out.println(this.status);
    }

    public String getSubject(){
        return this.subject;
    }

    public String getBody(){
        return this.body;
    }

    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }

    protected void printText(){
        System.out.println("Some Text.");
    }

    public void transport(){
        throw new NoTransportException();
    }

}
