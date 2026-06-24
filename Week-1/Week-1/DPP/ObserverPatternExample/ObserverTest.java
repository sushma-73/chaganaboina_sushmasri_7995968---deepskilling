package DPP.ObserverPatternExample;

public class ObserverTest {


    public static void main(String[] args) {


        StockMarket market =
                new StockMarket();



        Observer mobile =
                new MobileApp();


        Observer web =
                new WebApp();



        market.registerObserver(mobile);

        market.registerObserver(web);



        market.setStockPrice(150.50);


        System.out.println("----------------");


        market.setStockPrice(175.75);



        System.out.println("----------------");


        market.removeObserver(web);



        market.setStockPrice(200.00);
    }
}

