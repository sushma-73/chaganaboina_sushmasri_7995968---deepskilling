package DPP.BuilderPatternExample;

public class BuilderTest {

    public static void main(String[] args) {


        Computer gamingPC =
                new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setWifi(true)
                .build();



        Computer officePC =
                new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setWifi(true)
                .build();



        gamingPC.displayInfo();

        System.out.println("----------------");

        officePC.displayInfo();
    }
}
