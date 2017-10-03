package com.inheritance;

public class EmailNotification extends Notification {

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        status = "Not Default";
    }

    private String recipient;
    private String smtpProvider;

    public String getRecipient(){
        return this.recipient;
    }

    public String getSmtpProvider(){
        return this.smtpProvider;
    }

    @Override
    protected Object clone() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (!getRecipient().equals(that.getRecipient())) return false;
        return getSmtpProvider().equals(that.getSmtpProvider());
    }

    @Override
    public int hashCode() {
        int result = getRecipient().hashCode();
        result = 31 * result + getSmtpProvider().hashCode();
        return result;
    }

    @Override
    public void transport() {
        System.out.println(getRecipient() + " " + getSmtpProvider() + " " + getSubject() + " " + getBody() + " " + getCreatedAt() + " " + status);
    }

    @Override
    public void printText() {
        System.out.println("Some Overridden Text.");
    }
}
