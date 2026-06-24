package DPP.StrategyPatternExample;

public class PaymentContext {


    private PaymentStrategy strategy;



    public void setPaymentStrategy(PaymentStrategy strategy) {

        this.strategy = strategy;
    }



    public void executePayment(double amount) {


        if (strategy == null) {

            System.out.println("Payment strategy not selected");
            return;
        }


        strategy.pay(amount);
    }
}
