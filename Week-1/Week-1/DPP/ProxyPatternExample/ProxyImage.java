package DPP.ProxyPatternExample;

public class ProxyImage implements Image {


    private String fileName;

    private RealImage realImage;



    public ProxyImage(String fileName) {

        this.fileName = fileName;
    }



    @Override
    public void display() {


        // Lazy initialization
        if (realImage == null) {

            realImage = new RealImage(fileName);
        }


        // Cached object reused
        realImage.display();
    }
}
