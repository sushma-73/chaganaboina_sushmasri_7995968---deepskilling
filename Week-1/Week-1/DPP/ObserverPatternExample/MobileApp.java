package DPP.ObserverPatternExample;

public class MobileApp implements Observer {


    @Override
    public void update(double stockPrice) {

        System.out.println(
            "Mobile App Alert: Stock price is now $" 
            + stockPrice
        );
    }
}
