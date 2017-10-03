package com.inheritance;

public class TextNotification extends Notification {

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    private String recipient;
    private String smsProvider;

    public String getRecipient(){
        return this.recipient;
    }

    public String getSmsProvider(){
        return this.smsProvider;
    }

    @Override
    public void transport(){
        System.out.println(getRecipient() + " " + getSmsProvider() + " " + getSubject() + " " + getBody() + " " + getCreatedAt() + " " + status);
    }



}

