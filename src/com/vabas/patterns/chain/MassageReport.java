package com.vabas.patterns.chain;

public class MassageReport {
    public static void main(String[] args) {
        Notifier simpleReport = new NormalMassageNotifier(Priority.NORMAL);
        Notifier emailReport = new EmailNotifier(Priority.IMPOTENT);
        Notifier smsReport = new SmsNotifier(Priority.ASAP);

        simpleReport.setNextNotifier(emailReport);
        emailReport.setNextNotifier(smsReport);

        simpleReport.notifierManager("It's ok!", Priority.NORMAL);
        simpleReport.notifierManager("Some thing wrong", Priority.IMPOTENT);
        simpleReport.notifierManager("It's total big problem, super error", Priority.ASAP);

    }
}
