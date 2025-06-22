public class NotificationTest {
    public static void main(String[] args) {
        // Base notifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate with SMS
        Notifier smsDecorator = new SMSNotifierDecorator(emailNotifier);

        // Further decorate with Slack
        Notifier slackDecorator = new SlackNotifierDecorator(smsDecorator);

        // Final notification
        slackDecorator.send("Meeting at 10 AM");
    }
}
