package DPP.AdapterPatternExample;

public class AdapterTest {

    public static void main(String[] args) {


        PayPalGateway paypal =
                new PayPalGateway();


        PaymentProcessor paypalProcessor =
                new PayPalAdapter(paypal);


        paypalProcessor.processPayment(100.50);



        StripeGateway stripe =
                new StripeGateway();


        PaymentProcessor stripeProcessor =
                new StripeAdapter(stripe);


        stripeProcessor.processPayment(250.75);
    }
}
