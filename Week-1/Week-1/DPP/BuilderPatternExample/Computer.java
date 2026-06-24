package DPP.BuilderPatternExample;

public class Computer {

    private String CPU;
    private String RAM;
    private String Storage;
    private String GraphicsCard;
    private boolean hasWifi;


    private Computer(Builder builder) {

        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.GraphicsCard = builder.GraphicsCard;
        this.hasWifi = builder.hasWifi;
    }


    public void displayInfo() {

        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + Storage);
        System.out.println("Graphics Card: " + GraphicsCard);
        System.out.println("WiFi Available: " + hasWifi);
    }



    public static class Builder {

        private String CPU;
        private String RAM;
        private String Storage;
        private String GraphicsCard;
        private boolean hasWifi;


        public Builder setCPU(String CPU) {

            this.CPU = CPU;
            return this;
        }


        public Builder setRAM(String RAM) {

            this.RAM = RAM;
            return this;
        }


        public Builder setStorage(String Storage) {

            this.Storage = Storage;
            return this;
        }


        public Builder setGraphicsCard(String GraphicsCard) {

            this.GraphicsCard = GraphicsCard;
            return this;
        }


        public Builder setWifi(boolean hasWifi) {

            this.hasWifi = hasWifi;
            return this;
        }


        public Computer build() {

            return new Computer(this);
        }
    }
}
