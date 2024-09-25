public class BasicMediaPlayer extends MultimediaDevice {
    String supportedFormats;
    public BasicMediaPlayer(String brand,String model,int yearOfManufacture,String supportedFormats) {
        super(brand,model,yearOfManufacture);
        this.supportedFormats = supportedFormats;
    }
    public void play() {
        System.out.println("playing multimedia content.supported formats: " + supportedFormats);
    }
}
