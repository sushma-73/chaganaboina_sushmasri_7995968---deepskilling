package DPP.StrategyPatternExample;

public class StrategyTest {


    public static void main(String[] args) {


        PaymentContext context =
                new PaymentContext();



        PaymentStrategy creditCard =
                new CreditCardPayment(
                        "1234-5678-9012"
                );


        context.setPaymentStrategy(creditCard);

        context.executePayment(500.00);



        System.out.println("----------------");



        PaymentStrategy paypal =
                new PayPalPayment(
                        "user@gmail.com"
                );


        context.setPaymentStrategy(paypal);

        context.executePayment(750.00);
    }
}
