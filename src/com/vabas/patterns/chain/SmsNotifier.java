package com.vabas.patterns.chain;

public class SmsNotifier extends Notifier{

    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Sending sms: " + massage);
    }
}
