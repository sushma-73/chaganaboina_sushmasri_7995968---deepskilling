package DPP.DecoratorPatternExample;

public class DecoratorTest {

    public static void main(String[] args) {


        Notifier notifier =
                new EmailNotifier();


        notifier.send("Server is down");


        System.out.println("----------------");


        Notifier smsNotifier =
                new SMSNotifierDecorator(notifier);


        smsNotifier.send("Server is down");


        System.out.println("----------------");


        Notifier multiNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()
                        )
                );


        multiNotifier.send("Database backup completed");
    }
}
