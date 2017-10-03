package com.inheritance;

public class Main {

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification("Subject1", "Body1", "Recipient1", "smtpProvider1");
        TextNotification textNotification = new TextNotification("Subject2", "Body2", "Recipient2", "smsProvider1");

        emailNotification.transport();
        textNotification.transport();

        emailNotification.showStatus();
        textNotification.showStatus();

        emailNotification.printText();

        Object emailNotificationClone = emailNotification.clone();

        System.out.println(emailNotificationClone.equals(emailNotification));

    }
}
