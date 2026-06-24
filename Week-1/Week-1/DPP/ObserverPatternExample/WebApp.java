package DPP.ObserverPatternExample;

public class WebApp implements Observer {


    @Override
    public void update(double stockPrice) {

        System.out.println(
            "Web App Update: Stock price is now $" 
            + stockPrice
        );
    }
}
