package DPP.AdapterPatternExample;

public class StripeGateway {

    public void chargeCard(double amount) {

        System.out.println("Payment of $" + amount + 
                " processed using Stripe Gateway");
    }
}
